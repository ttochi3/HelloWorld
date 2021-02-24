package javaStudy;

public class StringExam2 {

	public static void main(String[] args) {
		String str1 = "hello world";
		String str2 = str1.substring(5);
		System.out.println(str1);
		System.out.println(str2);
		
		String str3 = str1 + str2;
		System.out.println(str3);
		//위의 코드는 내부적으로 아래와 같이 생성되고 컴파일된다.
		String str4 = new StringBuffer().append(str1).append(str2).toString();
		System.out.println(str4);
		
		String str5 = "";
		for(int i=0; i<100; i++) {
			str5 = str5 + "*";
		}
		System.out.println(str5);
		//위처럼 String + 는 안좋은 방법이다, 아래오 같이 사용하라.
		StringBuffer sb = new StringBuffer();
		for(int i=0; i<100; i++) {
			sb.append("*");
		}
		String str6 = sb.toString();
		System.out.println(str6);
		
	}

}
