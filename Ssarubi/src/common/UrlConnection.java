package common;

import java.io.File;
import java.io.FileOutputStream;
import java.io.InputStream;
import java.net.HttpURLConnection;
import java.net.URL;
import java.util.ArrayList;

public class UrlConnection {
	
	public static void main(String[] args) throws Exception{
		
		ArrayList<String> arrayList = new ArrayList<String>();

			arrayList.add("R0003394!___!http://agrecom.kiat.or.kr:8080/pdfView/covueDownFile.jsp?srcfile=/edmdata/migration/EAS/files-com/dc/dc_sign/2014/A00770013301_1/A00770013301_1_X.PDF!___!2014!___!1");
			arrayList.add("R0003393!___!http://agrecom.kiat.or.kr:8080/pdfView/covueDownFile.jsp?srcfile=/edmdata/migration/EAS/files-com/dc/dc_sign/2014/A00770010301_2/A00770010301_2_X.PDF!___!2014!___!2");
			arrayList.add("R0001413!___!http://agrecom.kiat.or.kr:8080/pdfView/covueDownFile.jsp?srcfile=/edmdata/migration/EAS/files-com/dc/dc_sign/2014/A00430008403_1/A00430008403_1_X.PDF!___!2014!___!1");
			arrayList.add("R0002660!___!http://agrecom.kiat.or.kr:8080/pdfView/covueDownFile.jsp?srcfile=/edmdata/migration/EAS/files-com/dc/dc_sign/2014/A00610006402_1/A00610006402_1_X.PDF!___!2014!___!1");
			arrayList.add("R0001414!___!http://agrecom.kiat.or.kr:8080/pdfView/covueDownFile.jsp?srcfile=/edmdata/migration/EAS/files-com/dc/dc_sign/2014/A00430010003_1/A00430010003_1_X.PDF!___!2014!___!1");
			arrayList.add("R0002659!___!http://agrecom.kiat.or.kr:8080/pdfView/covueDownFile.jsp?srcfile=/edmdata/migration/EAS/files-com/dc/dc_sign/2014/A00610000502_1/A00610000502_1_X.PDF!___!2014!___!1");
			arrayList.add("R0000666!___!http://agrecom.kiat.or.kr:8080/pdfView/covueDownFile.jsp?srcfile=/edmdata/migration/EAS/files-com/dc/dc_sign/2014/A00060002504_1/A00060002504_1_X.PDF!___!2014!___!1");
			arrayList.add("R0002651!___!http://agrecom.kiat.or.kr:8080/pdfView/covueDownFile.jsp?srcfile=/edmdata/migration/EAS/files-com/dc/dc_sign/2014/A00610007802_2/A00610007802_2_X.PDF!___!2014!___!2");
			arrayList.add("R0002661!___!http://agrecom.kiat.or.kr:8080/pdfView/covueDownFile.jsp?srcfile=/edmdata/migration/EAS/files-com/dc/dc_sign/2014/A00610007302_1/A00610007302_1_X.PDF!___!2014!___!1");
			arrayList.add("R0001412!___!http://agrecom.kiat.or.kr:8080/pdfView/covueDownFile.jsp?srcfile=/edmdata/migration/EAS/files-com/dc/dc_sign/2014/A00430001303_1/A00430001303_1_X.PDF!___!2014!___!1");
			arrayList.add("R0002662!___!http://agrecom.kiat.or.kr:8080/pdfView/covueDownFile.jsp?srcfile=/edmdata/migration/EAS/files-com/dc/dc_sign/2014/A00610008002_2/A00610008002_2_X.PDF!___!2014!___!2");
			arrayList.add("R0000665!___!http://agrecom.kiat.or.kr:8080/pdfView/covueDownFile.jsp?srcfile=/edmdata/migration/EAS/files-com/dc/dc_sign/2014/A00060002004_2/A00060002004_2_X.PDF!___!2014!___!2");
			arrayList.add("R0001518!___!http://agrecom.kiat.or.kr:8080/pdfView/covueDownFile.jsp?srcfile=/edmdata/migration/EAS/files-com/dc/dc_sign/2015/A00430011504_1/A00430011504_1_X.PDF!___!2015!___!1");
			arrayList.add("R0001510!___!http://agrecom.kiat.or.kr:8080/pdfView/covueDownFile.jsp?srcfile=/edmdata/migration/EAS/files-com/dc/dc_sign/2015/A00430006304_1/A00430006304_1_X.PDF!___!2015!___!1");
			arrayList.add("R0001508!___!http://agrecom.kiat.or.kr:8080/pdfView/covueDownFile.jsp?srcfile=/edmdata/migration/EAS/files-com/dc/dc_sign/2015/A00430002504_2/A00430002504_2_X.PDF!___!2015!___!2");
			arrayList.add("R0001507!___!http://agrecom.kiat.or.kr:8080/pdfView/covueDownFile.jsp?srcfile=/edmdata/migration/EAS/files-com/dc/dc_sign/2015/A00430002104_1/A00430002104_1_X.PDF!___!2015!___!1");
		
		for(int i = 0; i < arrayList.size(); i++){
			
			String[] tempArrString = ((String)arrayList.get(i)).split("!___!");
			System.out.println("과제번호=" + tempArrString[0]);
			
			//과제폴더 생성
			String detFolder = "D:\\fileDown";
			File file = new File(detFolder + "\\" + tempArrString[0]);
			if(!file.exists()) file.mkdir();
			
			// 해당 년차 폴더 생성
			File subFile = new File(detFolder + "\\" + tempArrString[0] + "\\" + tempArrString[2]);
			if(!subFile.exists()) subFile.mkdir();
				
			//파일명 생성
			File realFile = new File(detFolder + "\\" + tempArrString[0] + "\\" + tempArrString[2] + "\\" + tempArrString[1].substring(tempArrString[1].lastIndexOf("/")+1, tempArrString[1].length()));
		
			// 파일 다운로드
			try{
				URL url = new URL(tempArrString[1]);
				HttpURLConnection conn = (HttpURLConnection)url.openConnection();
                
                 //다운로드 받을 파일의 크기 가져오기
                 int len = conn.getContentLength();
                
                 //다운로드 받은 내용을 저장할 바이트 배열 생성
                 byte [] raster = new byte[len];
                 
                 //URL에서 바이트 단위로 읽기위한 스트림 생성
                InputStream is = conn.getInputStream();
                
                 //파일에 기록하기 위한 파일 스트림 생성
                FileOutputStream fos = new FileOutputStream(realFile);
                
                while(true){
                      //is에서 한 바이트를 읽어서 raster에 기록하고
                      //그 값을 read에 저장
                     int read = is.read(raster);
                     
                      //읽어온 값이 없으면 종료
                      if(read <= 0) break;
                     
                      //읽어온 데이터가 있으면 파일에 기록
                      //raster 배열의 0번째 부터 read 만큼 기록
                      fos.write(raster, 0 , read);
                }
                is.close();
                fos.close();
                conn.disconnect();
                
                System.out.println("존재  파일="+tempArrString[1]);
			}
			catch(Exception exception){
				System.out.println("존재하지 않는 파일="+tempArrString[1]);
			}
		}
	}
}
