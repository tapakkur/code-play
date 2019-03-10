package com.tapakkur.thread_2;

import kotlin.jvm.Synchronized;

/**
 * created by tapakkur on 2019/2/1
 */
public class ThreadDemo implements Runnable {
    private int tichet = 15;

    @Override
    public void run() {
        for (int i = 0; i < 20; i++) {
            this.save();
        }
    }

    public synchronized void save () {
        if (this.tichet > 0) {
            try {
                Thread.sleep(1000);
            } catch (InterruptedException e) {
                e.printStackTrace();
            }
            System.out.println(Thread.currentThread().getName() +
                    "卖票" + " the ticket is " + this.tichet--);
        }
    }

    public static void main (String args[]) {
        ThreadDemo demo = new ThreadDemo();
        new Thread(demo, "线程A").start();
        new Thread(demo, "线程B").start();
        new Thread(demo, "线程C").start();
    }
}
