package common;

import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.File;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.FileWriter;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.Arrays;

public class FileReadWrite {
	public static void main(String[] args) {

//		input
		
		FileInputStream fis = null;        
        InputStreamReader isr = null;    
        BufferedReader br = null;        
 
        String temp = "";
        String content = null;

//        File 경로
        File file = new File("C:\\Users\\Administrator\\Downloads\\Testdata.log");
 
        try {
            // 파일을 읽어들여 File Input 스트림 객체 생성
            fis = new FileInputStream(file);
            // File Input 스트림 객체를 이용해 Input 스트림 객체를 생서하는데 인코딩을 UTF-8로 지정
            isr = new InputStreamReader(fis, "UTF-8");
            // Input 스트림 객체를 이용하여 버퍼를 생성
            br = new BufferedReader(isr);
         
            // 버퍼를 한줄한줄 읽어들여 내용 추출
            while((temp = br.readLine()) != null) {
                if(content == null){
                	content = Arrays.toString(temp.split("]")) + "\n";
                }else{
                	content += Arrays.toString(temp.split("]")) + "\n";
                }
            }
            System.out.println(content);
            
        } catch (FileNotFoundException e) {
        	System.out.println("파일이 존재하지 않습니다.");
            e.printStackTrace();
        } catch (Exception e) {
        	System.out.println("처리중 오류가 발생하였습니다.");
            e.printStackTrace();
        } finally {
            try {fis.close();} catch (IOException e) {e.printStackTrace();}
            try {isr.close();} catch (IOException e) {e.printStackTrace();}
            try {br.close();} catch (IOException e) {e.printStackTrace();}
        }
        
        
//		 output
        
        FileWriter fw = null;
        BufferedWriter bw = null;
        
        try{
            fw = new FileWriter("C:\\Users\\Administrator\\Downloads\\output.txt");
            bw = new BufferedWriter(fw);
            String output = content;
 
            bw.write(output);
            bw.newLine();
            bw.close();
        }
        catch (Exception e){
        	System.out.println("처리중 오류가 발생하였습니다.");
            System.out.println(e);
        }
        
    }
}
