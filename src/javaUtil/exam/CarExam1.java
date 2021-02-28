package javaUtil.exam;

import java.util.*;

//main������ �پ��� ������ Car��ü�� ���� cars��� ����Ʈ�� �ֽ��ϴ�.
//�� cars��� ����Ʈ�� �ִ� ���� �˻��ؼ� ���ǿ� �´� ���� ����ϴ� �������� ���캼 �ٵ���.
//ù ��°�� ������ 2000���� �� ������ �˻��ؼ� �̸��� ����ϴ� printCarCheaperThan�̶�� �Լ��� �ֽ��ϴ�.
public class CarExam1 {
    public static void main(String[] args){
        //Car��ü�� ���� cars�� �ֽ��ϴ�.
        List<Car> cars = new ArrayList<>();
        cars.add( new Car("������",2,800,3) );
        cars.add( new Car("������",12,1500,8) );
        cars.add( new Car("�߰���",5,2200,0) );
        cars.add( new Car("�����",5,3500,1) );
        
        printCarCheaperThan(cars, 2000);
    }
    
    public static void printCarCheaperThan(List<Car> cars, int price){
        for(Car car : cars){
            if(car.price < price){
                System.out.println(car);
            }
        }
    }
}
