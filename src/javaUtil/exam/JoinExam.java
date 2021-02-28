package javaUtil.exam;

public class JoinExam {

	public static void main(String[] args) {
		MyThread5 thread = new MyThread5();
		thread.start();
		
		System.out.println("시작");
		
		try {
			thread.join(); //쓰레드가 종료될때까지 기다려줌.
		} catch (InterruptedException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		
		System.out.println("종료!");
	}

}
