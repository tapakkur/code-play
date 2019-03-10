package com.tapakkur.park;

/**
 * created by tapakkur on 2019/1/29
 */
public class Park {
    private Link cars = new Link(); // 这链表保存汽车

    // 停车场里新停一俩汽车
    public void parkCar (Car car) {
        this.cars.add(car);
    }

    //从停车场里开走一俩汽车
    public void byCar (Car car) {
        this.cars.remove(car);
    }

    // 模糊查询停车场里的汽车
    public Link searchCar (String searchWord) {
        Link result = new Link(); // 查询结果也将是链表
        Object temp[] = this.cars.toArray();//将链表转换为数组
        for (int i = 0; i < temp.length; i++) {
            Car car = (Car) temp[i]; // 强制转型，向下转型
            if (car.getCarType().contains(searchWord)) {
                result.add(car);
            }
        }
        return result;
    }
}
