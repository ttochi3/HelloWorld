package javaUtil.exam;

import java.lang.reflect.Method;

public class MyHelloExam {

	public static void main(String[] args) {
		MyHello hello = new MyHello();
		
		try {
			Method method = hello.getClass().getDeclaredMethod("hello"); //hello라는 메서드정보를 가져온다.
			
			if(method.isAnnotationPresent(Count100.class)) { //Count100 의 머노테이션이 적용된 메서드인가?
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
