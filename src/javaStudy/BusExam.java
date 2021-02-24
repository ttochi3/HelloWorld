package javaStudy;

public class BusExam {

	public static void main(String[] args) {
		Bus bus = new Bus();
		bus.run();
        bus.ppangppang();
        
        Car car = new Car();
        car.run();
        //car.ppangppang(); //자식클래스 메서드는 사용못함.
        
        Car c = new Bus();
        c.run();
        //c.ppangppang(); //자식의 메서드는 사용할 수 없음.
        //이럴때 형변환을 한다.
        //Bus bus = c; //허용하지 않음.
        Bus bus2 = (Bus)c;
        bus2.run();
        bus2.ppangppang();
	}

}
