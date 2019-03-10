package com.tapakkur.thread;

/**
 * created by tapakkur on 2019/1/31
 */
public class MyThread implements java.lang.Runnable {
    private String name;

    public MyThread (String name) {
        this.name = name;
    }

    @Override
    public void run() {
        for (int i = 0; i < 200; i++) {
            System.out.println("the name is " + i + "th " + this.name);
        }
    }
}
