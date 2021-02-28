package javaUtil.exam;

import java.util.*;

//���� �˻����ǿ� ���� �͸� Ŭ������ �̿��ϸ� ���� Ŭ������ ���� �ʿ䰡 �����Ƿ� �ڵ尡 ���� �� ª�����ϴ�.
public class CarExam3 {
    public static void main(String[] args){
        List<Car> cars = new ArrayList<>();
        cars.add( new Car("������",2,800,3) );
        cars.add( new Car("������",12,1500,8) );
        cars.add( new Car("�߰���",5,2200,0) );
        cars.add( new Car("�����",5,3500,1) );
        
        printCar(cars, 
            //�������̽� CheckCar�� �����ϴ� �͸�Ŭ������ ����ϴ�.
            new CheckCar(){
                public boolean test(Car car){
                    return car.capacity >= 4 && car.price < 2500;
                }
            });
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
}
