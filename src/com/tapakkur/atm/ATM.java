package com.tapakkur.atm;

public class ATM {
    private String id;
    private String user;
    private String password;
    private double balance;

    public ATM() {
        // 无参数
    }

    public ATM(String id, String user, String password, double balance) {
        this.id = id;
        this.user = user;
        this.password = password;
        this.balance = balance;
    }

    public String getId() {
        return id;
    }

    public void setId(String id) {
        this.id = id;
    }

    public String getUser() {
        return user;
    }

    public void setUser(String user) {
        this.user = user;
    }

    public String getPassword() {
        return password;
    }

    public void setPassword(String password) {
        this.password = password;
    }

    public double getBalance() {
        return balance;
    }

    public void setBalance(double balance) {
        this.balance = balance;
    }

    public String getInfo () {
        return "id: " + id + ", \nuser: " + user + ", \nbalance: " + balance;
    }
}