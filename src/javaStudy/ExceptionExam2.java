package javaStudy;

public class ExceptionExam2 {

	public static void main(String[] args) {
		int i = 10;
		int j = 0;
		try {
		    int k = divide(i,j);
		    System.out.println(k);
		} catch(ArithmeticException ae) {
			System.out.println(ae.toString());
		}
	}
	
	//divide 메서드에서 오류를 처리하지 않고 호출한 쪽에서 예외를 처리하라는 뜻으로 예외를 던진다.
	public static int divide(int i, int j) throws ArithmeticException {
		int k = i/j;
		return k;
	}

}
