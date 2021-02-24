package javaStudy;

public class Truck extends Car2 {
    public Truck() {
    	//super(); //기본적으로 부모의 기본생성자를 생성하라고 자동적으로 실행함.
    	super("소방차");
    	System.out.println("Truck의 기본생성자 입니다.");
    }
}
