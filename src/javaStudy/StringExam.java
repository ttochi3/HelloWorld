package javaStudy;

public class StringExam {

	public static void main(String[] args) {
		String str1 = "hello"; //�޸𸮿� "hello" �ν��Ͻ��� �����ϰ� str1 �� ����(���۷���)�Ѵ�.
		String str2 = "hello"; //"hello" ��� �ν��Ͻ��� �̹� �����Ƿ� str2�� str1 �� ���� ���� �����Ѵ�.
		
		String str3 = new String("hello"); //str3 �� ���ο� "hello"��� �ν��Ͻ��� �����ϰ� �����Ѵ�.
		String str4 = new String("hello"); //str4 �� ���ο� "hello"��� �ν��Ͻ��� �����ϰ� �����Ѵ�.
		
		if(str1 == str2)
			System.out.println("str1�� str2�� ���� ���۷����Դϴ�."); //������.

		if(str1 == str3)
			System.out.println("str1�� str3�� ���� ���۷����Դϴ�."); //�ٸ� �����̹Ƿ� ���� �ʴ�.

		if(str3 == str4)
			System.out.println("str3�� str4�� ���� ���۷����Դϴ�."); //�ٸ� �����̹Ƿ� ���� �ʴ�.
		
		System.out.println(str1);
		
		System.out.println(str1.substring(3));
		
		System.out.println(str1);
		
	    if(str1.equals(str2))
	    	System.out.println("str1�� str2�� ���� �����Դϴ�."); //str1�� str2�� ���� ���ڳ����̴�.
		
	    if(str1.equals(str3))
	    	System.out.println("str1�� str3�� ���� �����Դϴ�."); //str1�� str3�� ���� ���ڳ����̴�.
		
	    if(str3.equals(str4))
	    	System.out.println("str3�� str4�� ���� �����Դϴ�."); //str3�� str4�� ���� ���ڳ����̴�.

	}

}
