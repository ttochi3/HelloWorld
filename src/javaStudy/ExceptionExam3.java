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
//			System.out.println("2번째 매개변수는 0이면 안됩니다.");
//			return 0; //잘못된 값을 반환해줄 수도 있다.
			throw new IllegalArgumentException("0으로 나눌 수 없습니다."); //강제 예외 던짐.
		}
		int k = i/j;
		return k;
	}

}
