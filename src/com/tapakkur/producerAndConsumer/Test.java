package com.tapakkur.producerAndConsumer;

/**
 * created by tapakkur on 2019/2/1
 */
public class Test {
    public static void main (String args[]) {
        Message msg = new Message();
        new Thread(new Producer(msg)).start();
        new Thread(new Consumer(msg)).start();
    }
}
