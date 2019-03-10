package com.tapakkur.park;

/**
 * created by tapakkur on 2019/1/29
 */
public class Taxi implements Car {
    private String carType;
    private String carNumber;

    public Taxi () {
        //
    }

    public Taxi (String carType, String carNumber) {
        this.carNumber = carNumber;
        this.carType = carType;
    }

    @Override
    public boolean equals(Object obj) {
        if (obj == null)  return false;
        if (this == obj) return true;
        if (!(obj instanceof Taxi)) return false;

        Taxi taxi = (Taxi) obj;
        if (taxi.carType.equals(this.carType) && taxi.carNumber.equals(this.carNumber)) {
            return true;
        }
        return false;
    }

    public void setCarNumber(String carNumber) {
        this.carNumber = carNumber;
    }

    @Override
    public String getCarNumber() {
        return carNumber;
    }

    public void setCarType(String carType) {
        this.carType = carType;
    }

    @Override
    public String getCarType() {
        return carType;
    }

    @Override
    public String toString() {
        return "Car Type : " + this.carType + ", Car Number : " + this.carNumber;
    }
}
