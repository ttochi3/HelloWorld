package javaStudy;

public class StringExam {

	public static void main(String[] args) {
		String str1 = "hello"; //메모리에 "hello" 인스턴스를 생성하고 str1 이 참조(레퍼런스)한다.
		String str2 = "hello"; //"hello" 라는 인스턴스가 이미 있으므로 str2는 str1 과 같은 곳을 참조한다.
		
		String str3 = new String("hello"); //str3 은 새로운 "hello"라는 인스턴스를 생성하고 참조한다.
		String str4 = new String("hello"); //str4 은 새로운 "hello"라는 인스턴스를 생성하고 참조한다.
		
		if(str1 == str2)
			System.out.println("str1과 str2는 같은 레퍼런스입니다."); //수행함.

		if(str1 == str3)
			System.out.println("str1과 str3는 같은 레퍼런스입니다."); //다른 참조이므로 같지 않다.

		if(str3 == str4)
			System.out.println("str3과 str4는 같은 레퍼런스입니다."); //다른 참조이므로 같지 않다.
		
		System.out.println(str1);
		
		System.out.println(str1.substring(3));
		
		System.out.println(str1);
		
	    if(str1.equals(str2))
	    	System.out.println("str1과 str2는 같은 문자입니다."); //str1과 str2는 같은 문자내용이다.
		
	    if(str1.equals(str3))
	    	System.out.println("str1과 str3는 같은 문자입니다."); //str1과 str3는 같은 문자내용이다.
		
	    if(str3.equals(str4))
	    	System.out.println("str3과 str4는 같은 문자입니다."); //str3과 str4는 같은 문자내용이다.

	}

}
