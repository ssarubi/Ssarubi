package TechRegistNo;
import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.io.OutputStreamWriter;
import java.io.PrintWriter;
import java.io.StringReader;
import java.net.URL;
import java.net.URLConnection;

import javax.xml.parsers.DocumentBuilder;
import javax.xml.parsers.DocumentBuilderFactory;

import org.w3c.dom.Document;
import org.w3c.dom.Node;
import org.w3c.dom.NodeList;
import org.xml.sax.InputSource;

public class TestTechRegNo {

	public static void main(String[] args)
	{
//		String TechRegNo = "11475028";
//		String Name = "박정우";
		
//		String TechRegNo = "11554893";
//		String Name = "박수범";		
		
		String TechRegNo = "11565830";
		String Name = "박보아";
		
		try
		{
			// 기관 아이디
			String webserv_org = "KIAT";
			// 기관 암복호화 키
	    	String orgnCryptKey = "KIAT5789327533357985742999932885";
	    	// 접속 URL
	    	String urlAddr = "http://hurims.ntis.go.kr/researcher/orgapi/ws_hmreg.jsp";
		 	URL url = new URL(urlAddr);

		 	// 과기인등록번호와 성명 암호화
			TechRegNo = CryptARIA.encryptkey(TechRegNo, orgnCryptKey);
			Name = CryptARIA.encryptkey(Name , orgnCryptKey);


	        URLConnection con = url.openConnection();
	        con.setDoOutput(true);

	        StringBuffer sb = new StringBuffer();  //post방식으로 파라미터 전달
			sb.append("reg_no").append("=").append(TechRegNo).append("&");
	        sb.append("name").append("=").append(Name).append("&");
			sb.append("webserv_org").append("=").append(webserv_org);

			PrintWriter ot = new PrintWriter(new OutputStreamWriter(con.getOutputStream(),"euc-kr"));

	        ot.write(sb.toString());
	        ot.flush();

	        System.out.println("접근 URL\n" + urlAddr + "?" + sb.toString());

	        BufferedReader in = new BufferedReader(new InputStreamReader(con.getInputStream()));
	        String strXML ="";
	        String inputLine="";
	        StringBuffer xmlData =  new  StringBuffer();   //결과 받을 StringBuffer 변수
	        
	        while ((inputLine = in.readLine()) != null){
	        	xmlData.append(inputLine);
	        }
	        
			strXML = CryptARIA.decryptkey(xmlData.toString().trim(), orgnCryptKey);   //결과 복호화

	        in.close();

			DocumentBuilder docBuilder = DocumentBuilderFactory.newInstance().newDocumentBuilder();//xml parsing
	        Document doc = docBuilder.parse(new InputSource(new StringReader(strXML)));

	        NodeList nodeList = doc.getDocumentElement().getElementsByTagName("인력기본정보");
	        
	        System.out.println((strXML.replace("</인력기본정보\n></인력정보>", "</인력기본정보>\n</인력정보>")).toString());

	        for(int i=0; i < nodeList.getLength(); i++){//화면에 보여주기 위해 맵에 담는다.
	        	Node row = nodeList.item(i);
	        	NodeList childList = row.getChildNodes();
	        	
	        	for(int a=0; a<childList.getLength(); a++){
	        		Node node = childList.item(a);
	        		
	        		System.out.println(node.getNodeName() + " : " + node.getTextContent());
	        		System.out.println("----------------------------------------------------------------------");
	        		//map.put(node.getNodeName(), node.getTextContent());
	        	}
	        }

		}
		catch(Exception e)
		{
			System.out.println("시스템에 장애가 발생했습니다1.");
			e.printStackTrace();
		}
		
	}
	
}
