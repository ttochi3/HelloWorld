package javaStudy;

import java.util.Scanner;

public class DoWhileExam {

	public static void main(String[] args) {
		//while ���� �ѹ��� ���� ���Ҽ��� ������,
		//do while ���� ��� �� �� �����Ѵ�.
		
		int value = 0;
		Scanner scan = new Scanner(System.in);
		
		do {
			value = scan.nextInt();
			System.out.println("�Է¹�����: " + value);
		} while(value != 10);
		
		System.out.println("�ݺ��� ����!!");

	}

}
