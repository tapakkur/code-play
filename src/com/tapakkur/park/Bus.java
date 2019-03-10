package com.tapakkur.park;

/**
 * created by tapakkur on 2019/1/29
 */
public class Bus implements Car {
    private String carType; // 车类型
    private String carNumber; // 车牌号

    public Bus () {
        // 不带参数构造方法
    }

    public Bus(String carType, String carNumber) {
        this.carType = carType;
        this.carNumber = carNumber;
    }

    @Override
    public boolean equals(Object obj) {
        if (obj == null) return false; // 如果obj为null，则返回false

        if (this == obj) return true; // 对比的数据存在

        if (!(obj instanceof Bus)) return false; // 如果obj不是BUS类型，则返回false

        Bus bus = (Bus) obj; // 向上强制转型
        if (this.carType.equals(bus.carType) && this.carNumber.equals(bus.carNumber)) {
            return true;
        }
        return false;
    }

    @Override
    public String toString() {
        return "Car Type : " + this.carType + ", Car Number : " + this.carNumber;
    }

    @Override
    public String getCarType() {
        return this.carType;
    }

    @Override
    public String getCarNumber() {
        return this.carNumber;
    }

    public void setCarType(String carType) {
        this.carType = carType;
    }

    public void setCarNumber(String carNumber) {
        this.carNumber = carNumber;
    }
}
