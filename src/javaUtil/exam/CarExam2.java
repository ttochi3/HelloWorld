package javaUtil.exam;

import java.util.*;

//�̹����� ������ �� ������ ����Դϴ�.
//����Ŭ������ �̿��ؼ� CheckCar��� �������̽��� �����,
//�װ� �����ϴ� CheckCarForBigAndNotExpensiveŬ������ ���� 4�� �̻��� Ż �� �ְ�,
//������ 2500������ ���� �˻��մϴ�.
public class CarExam2 {
    public static void main(String[] args){
        List<Car> cars = new ArrayList<>();
        cars.add( new Car("������",2,800,3) );
        cars.add( new Car("������",12,1500,8) );
        cars.add( new Car("�߰���",5,2200,0) );
        cars.add( new Car("�����",5,3500,1) );
        
        printCar(cars, new CheckCarForBigAndNotExpensive());
    }
    
    public static void printCar(List<Car> cars, CheckCar tester){
        for(Car car : cars){
            if (tester.test(car)) {
                System.out.println(car);
            }
        }
    }
    
    interface CheckCar{
        boolean test(Car car);
    }
    
    //����Ŭ������ ���� ����մϴ�.
    static class CheckCarForBigAndNotExpensive implements CheckCar{
        public boolean test(Car car){
            return car.capacity >= 4 && car.price < 2500;
        }
    }
}
