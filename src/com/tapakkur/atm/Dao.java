package com.tapakkur.atm;

/**
 * created by tapakkur on 2019/1/27
 */
public interface Dao {
    public void getInfo ();
    public void save (double balance);
    public double get (double balance);
    public void modify (String psw);
    public ATM all ();
}
