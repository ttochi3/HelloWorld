package javaStudy;

public class CarExam {

	public static void main(String[] args) {
		Car c1 = new Car(); //Car 의 객체를 새로 생성, 메모리에 생성하고 c1이 참조한다.
		Car c2 = new Car(); //Car 의 객체를 새로 생성, 메모리에 생성하고 c2이 참조한다.
		
		if(c1 == c2) {
			System.out.println("c1과 c2는 같은 객체이다.");
		} else {
			System.out.println("c1과 c2는 다른 객체이다.");
		}
		
		c1.name = "소방차";
		c1.number = 1234;
		
		c2.name = "구급차";
		c2.number = 1111;
		
		System.out.println(c1.name);
		System.out.println(c1.number);
		
		System.out.println(c2.name);
		System.out.println(c2.number);
	}

}
