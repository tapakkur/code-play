package com.tapakkur.mapreduce;

/**
 * created by tapakkur on 2019/2/7
 */
public class Orders {
    private String pname;
    private double price;
    private int amount;

    public Orders () {
        //
    }
    public Orders(String pname, double price, int amount) {
        this.pname = pname;
        this.price = price;
        this.amount = amount;
    }

    public String getPname() {
        return pname;
    }

    public void setPname(String pname) {
        this.pname = pname;
    }

    public double getPrice() {
        return price;
    }

    public void setPrice(double price) {
        this.price = price;
    }

    public int getAmount() {
        return amount;
    }

    public void setAmount(int amount) {
        this.amount = amount;
    }

    @Override
    public String toString() {
        return "product name: " + this.pname +
                ", product price: $" + this.price + ", product amount " + this.amount;
    }
}
