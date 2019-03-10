package com.tapakkur.producerAndConsumer;

/**
 * created by tapakkur on 2019/2/1
 */
public class Consumer implements Runnable {
    private Message msg = null;

    public Consumer (Message msg) {
        this.msg = msg;
    }

    @Override
    public void run() {
        for (int i = 0; i < 30; i++) {
            this.msg.get();
        }
    }
}
