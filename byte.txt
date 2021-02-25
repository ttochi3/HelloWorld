package javaIO.exam;

import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.IOException;

public class ByteExam1 {

	public static void main(String[] args) {
		long startTime = System.currentTimeMillis();
		FileInputStream fis = null;
		FileOutputStream fos = null;
		
		try {
		    fis = new FileInputStream("src/javaIO/exam/ByteExam1.java");
		    fos = new FileOutputStream("byte.txt");
		    
		    int readData = -1;
		    while((readData = fis.read())!=-1) {//1 byte 씩 읽어서
		    	fos.write(readData); //1 byte 씩 쓴다.
		    }
		    
		} catch(Exception e) {
			e.printStackTrace();
		} finally {
			try {
				fis.close();
				fos.close();
			} catch(IOException e) {
				e.printStackTrace();
			}
		}
		
		long endTime = System.currentTimeMillis();
		
		System.out.println(endTime - startTime);
	}

}
