package javaStudy;

import java.util.Scanner;

public class DoWhileExam {

	public static void main(String[] args) {
		//while 문은 한번도 실행 안할수도 있지만,
		//do while 문은 적어도 한 번 실행한다.
		
		int value = 0;
		Scanner scan = new Scanner(System.in);
		
		do {
			value = scan.nextInt();
			System.out.println("입력받은값: " + value);
		} while(value != 10);
		
		System.out.println("반복문 종료!!");

	}

}
