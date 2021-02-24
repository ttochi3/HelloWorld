package javaStudy;

public class CarExam2 {

	public static void main(String[] args) {
		//Car c1 = new Car(); //생성자. Car클래스에 생성자가 없으면 컴파일시 생성자를 생성한다.
		Car c2 = new Car("소방차");
		Car c3 = new Car("구급차");

		System.out.println(c2.name);
	}

}
