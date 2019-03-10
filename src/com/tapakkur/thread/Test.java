package com.tapakkur.thread;

/**
 * created by tapakkur on 2019/1/31
 */
public class Test {
    public static void main (String args[]) {
        MyThread newThread1 = new MyThread("线程A");
        MyThread newThread2 = new MyThread("线程B");
        MyThread newThread3 = new MyThread("线程C");
        new Thread(newThread1).start();
        new Thread(newThread2).start();
        new Thread(newThread3).start();
    }
}
