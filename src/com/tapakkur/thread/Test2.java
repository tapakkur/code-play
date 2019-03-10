package com.tapakkur.thread;

/**
 * created by tapakkur on 2019/2/1
 */
public class Test2 {
    public static void main (String args[]) {
        MyThread1 thread1 = new MyThread1();
        new Thread(thread1).start();
        new Thread(thread1).start();
        new Thread(thread1).start();
    }
}

class MyThread1 implements java.lang.Runnable {
    private int ticket = 5;

    @Override
    public void run() {
        for (int i = 0; i < 50; i++) {
            if (this.ticket > 0) {
                System.out.println("the ticket " + this.ticket--);
            }
        }
    }
}