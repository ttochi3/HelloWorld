package javaStudy;

public class BusExam {

	public static void main(String[] args) {
		Bus bus = new Bus();
		bus.run();
        bus.ppangppang();
        
        Car car = new Car();
        car.run();
        //car.ppangppang(); //�ڽ�Ŭ���� �޼���� ������.
        
        Car c = new Bus();
        c.run();
        //c.ppangppang(); //�ڽ��� �޼���� ����� �� ����.
        //�̷��� ����ȯ�� �Ѵ�.
        //Bus bus = c; //������� ����.
        Bus bus2 = (Bus)c;
        bus2.run();
        bus2.ppangppang();
	}

}
