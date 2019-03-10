package com.tapakkur.park;

/**
 * created by tapakkur on 2019/1/29
 */
public class Test {

    public static void main (String args[]) {
        Park park = new Park();
        Car car1 = new Bus("巴士1", "A1001"); // 通过子类对象来实例化接口对象，下同
        Car car2 = new Bus("巴士2", "A1002");
        Car car3 = new Bus("巴士3", "A1003");
        Car car4 = new Taxi("的士1", "B1001");
        Car car5 = new Taxi("的士2", "B1002");
        Car car6 = new Taxi("的士3", "B1003");
        park.parkCar(car1); // 停车
        park.parkCar(car2);
        park.parkCar(car3);
        park.parkCar(car4);
        park.parkCar(car5);
        park.parkCar(car6);
        park.byCar(car2); // 开走car2
        Link cars = park.searchCar("3"); // 模糊查询，返回结果还是链表类型
        Object array[] = cars.toArray(); // 将搜到的汽车链表转换成数组
        for (int i = 0; i < array.length; i++) {
            System.out.println(array[i]);
        }
    }
}
