package javaUtil.exam;

public class JoinExam {

	public static void main(String[] args) {
		MyThread5 thread = new MyThread5();
		thread.start();
		
		System.out.println("����");
		
		try {
			thread.join(); //�����尡 ����ɶ����� ��ٷ���.
		} catch (InterruptedException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		
		System.out.println("����!");
	}

}
