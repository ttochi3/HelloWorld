package javaStudy;

public class Car {
    //타입 필드명
	String name; //name 이라는 String 타입의 필드를 생성한다.
	int number;
	
	public Car() {
//		this.name = "이름없음";
//		this.number = 0;
		this("이용없음",0); //이렇게도 할 수 있음, Car 파라미터 둘을 받는 생성자를 이용하여 할수도 있음.
	}
	
	public Car(String name) { //파라미터 값을 받는 생성자 Overload, 기본생성자가 없으면 상관없지만 기본생성자 외 다른 생성자를 설정하면 기본생성자를 꼭 지정해야 한다.
         this.name = name;
	}
	
	public Car(String name, int number) {
		this.name = name;
		this.number = number;
	}
	
    public void run() {
    	System.out.println("달리다.");
    }
}
