package javaUtil.exam;

import java.lang.reflect.Method;

public class MyHelloExam {

	public static void main(String[] args) {
		MyHello hello = new MyHello();
		
		try {
			Method method = hello.getClass().getDeclaredMethod("hello"); //hello��� �޼��������� �����´�.
			
			if(method.isAnnotationPresent(Count100.class)) { //Count100 �� �ӳ����̼��� ����� �޼����ΰ�?
				for(int i = 0; i<10; i++) {
					hello.hello();
				}
			} else {
				hello.hello();
			}
		} catch (Exception e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
	}

}
