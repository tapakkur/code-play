package com.tapakkur.atm;

/**
 * created by tapakkur on 2019/1/27
 */
public class ServiceImpl implements Service {
    DaoImpl dao = new DaoImpl();

    @Override
    public void getInfo() {
        dao.getInfo();
    }

    @Override
    public void save(double balance) {
        dao.save(balance);
    }

    @Override
    public double get(double balance) {
        return dao.get(balance);
    }

    @Override
    public void modify(String psw) {
        dao.modify(psw);
        System.out.println("Modify the password is successful !");
    }

    @Override
    public ATM all() {
        return dao.all();
    }
}
