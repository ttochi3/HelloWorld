package javaStudy;

public class CarExam {

	public static void main(String[] args) {
		Car c1 = new Car(); //Car �� ��ü�� ���� ����, �޸𸮿� �����ϰ� c1�� �����Ѵ�.
		Car c2 = new Car(); //Car �� ��ü�� ���� ����, �޸𸮿� �����ϰ� c2�� �����Ѵ�.
		
		if(c1 == c2) {
			System.out.println("c1�� c2�� ���� ��ü�̴�.");
		} else {
			System.out.println("c1�� c2�� �ٸ� ��ü�̴�.");
		}
		
		c1.name = "�ҹ���";
		c1.number = 1234;
		
		c2.name = "������";
		c2.number = 1111;
		
		System.out.println(c1.name);
		System.out.println(c1.number);
		
		System.out.println(c2.name);
		System.out.println(c2.number);
	}

}
