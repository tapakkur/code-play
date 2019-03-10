package com.tapakkur.mapreduce;

import java.util.ArrayList;
import java.util.IntSummaryStatistics;
import java.util.List;
import java.util.stream.Stream;

/**
 * created by tapakkur on 2019/2/7
 */

class Car {
    private String carNo;
    private String belongs;

    public Car () {
        //
    }

    public Car(String carNo, String belongs) {
        this.carNo = carNo;
        this.belongs = belongs;
    }

    public String getCarNo() {
        return carNo;
    }

    public void setCarNo(String carNo) {
        this.carNo = carNo;
    }

    public String getBelongs() {
        return belongs;
    }

    public void setBelongs(String belongs) {
        this.belongs = belongs;
    }

    @Override
    public int hashCode() {
        return super.hashCode();
    }

    @Override
    public boolean equals(Object obj) {
        return super.equals(obj);
    }
}
public class CarTest {
    final static int amount = 0;

    public static void main (String args[]) {

        List<Car> cars = new ArrayList<Car>();
        cars.add(new Car("新A.1002","新疆"));
        cars.add(new Car("北A.1005","北京"));
        cars.add(new Car("新A.1004","新疆"));
        cars.add(new Car("卢A.1003","上海"));
        cars.add(new Car("新A.1002","新疆"));
        IntSummaryStatistics iss = cars.stream()
                .mapToInt((sc)->sc.getBelongs().contains("新") ? amount : 0)
                .summaryStatistics();
        System.out.println(iss.getCount());
    }
}
