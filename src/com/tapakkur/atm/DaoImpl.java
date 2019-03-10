package com.tapakkur.atm;

/**
 * created by tapakkur on 2019/1/27
 */
public class DaoImpl implements Dao {
    private ATM atm = new ATM("1", "jack", "123", 100000000.00);

    @Override
    public void getInfo() {
        System.out.println(atm.getInfo());
    }

    @Override
    public void save(double balance) {
        atm.setBalance(atm.getBalance() + balance);
        System.out.println("you have saved $" + balance + " just now\n" +
                "after this operation, your balance is $" + atm.getBalance());
    }

    @Override
    public double get(double balance) {
        if (balance < 0) {
            System.out.println("Illegal input,withdraw cash must be bigger than 0 !");
        } else {
            if (balance > atm.getBalance()) {
                System.out.println("Illegal input, your input can not be bigger than " + atm.getBalance());
            } else {
                System.out.println("you have got $" + balance);
                atm.setBalance(atm.getBalance() - balance);
            }
        }
        return atm.getBalance();
    }

    @Override
    public void modify(String psw) {
        atm.setPassword(psw);
    }

    @Override
    public ATM all() {
        return atm;
    }
}
