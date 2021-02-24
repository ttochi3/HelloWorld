package javaStudy;

public class ExceptionExam3 {

	public static void main(String[] args) {
		int i = 10;
		int j = 0;
		
		try {
		    int k = divide(i,j);
		    System.out.println(k);
		} catch(IllegalArgumentException ae) {
			System.out.println(ae.toString());
		}
	}
	
	public static int divide(int i, int j) throws IllegalArgumentException {
		if(j==0) {
//			System.out.println("2��° �Ű������� 0�̸� �ȵ˴ϴ�.");
//			return 0; //�߸��� ���� ��ȯ���� ���� �ִ�.
			throw new IllegalArgumentException("0���� ���� �� �����ϴ�."); //���� ���� ����.
		}
		int k = i/j;
		return k;
	}

}
