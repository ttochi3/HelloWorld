package javaStudy;

public class Car {
    //Ÿ�� �ʵ��
	String name; //name �̶�� String Ÿ���� �ʵ带 �����Ѵ�.
	int number;
	
	public Car() {
//		this.name = "�̸�����";
//		this.number = 0;
		this("�̿����",0); //�̷��Ե� �� �� ����, Car �Ķ���� ���� �޴� �����ڸ� �̿��Ͽ� �Ҽ��� ����.
	}
	
	public Car(String name) { //�Ķ���� ���� �޴� ������ Overload, �⺻�����ڰ� ������ ��������� �⺻������ �� �ٸ� �����ڸ� �����ϸ� �⺻�����ڸ� �� �����ؾ� �Ѵ�.
         this.name = name;
	}
	
	public Car(String name, int number) {
		this.name = name;
		this.number = number;
	}
	
    public void run() {
    	System.out.println("�޸���.");
    }
}
