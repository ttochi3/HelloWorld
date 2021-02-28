package javaUtil.exam;

import java.util.*;

//���� �˻����ǿ� ���� ���ٸ� �̿��ϸ� �޼ҵ� ������ �ʿ� �����Ƿ� �� �����ϰ� ǥ���� �� �ֽ��ϴ�. 
public class CarExam4 {
    public static void main(String[] args){
        //Car��ü�� ���� cars�� �ֽ��ϴ�.
        List<Car> cars = new ArrayList<>();
        cars.add( new Car("������",2,800,3) );
        cars.add( new Car("������",12,1500,8) );
        cars.add( new Car("�߰���",5,2200,0) );
        cars.add( new Car("�����",5,3500,1) );
        
        CarExam4 carExam = new CarExam4();
        carExam.printCar(cars, 
            //�������̽� CheckCar�� test�޼ҵ忡 �����ϴ� ���ٸ� ����ϴ�.
            (Car car) -> { return car.capacity >= 4 && car.price < 2500; }
        );
    }
    
    public void printCar(List<Car> cars, CheckCar tester){
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
