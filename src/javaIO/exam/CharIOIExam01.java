package javaIO.exam;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class CharIOIExam01 {

	public static void main(String[] args) {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		
		String line = null;
		
		try {
			line = br.readLine();
		} catch (IOException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		
		System.out.println(line);
		
		//�����ϰ� �ֿܼ��� �ƹ� ���ڳ� �Է��ϸ� �����ϰ� ����Ѵ�.
		
	}

}
