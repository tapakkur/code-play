package com.tapakkur.producerAndConsumer;

/**
 * created by tapakkur on 2019/2/1
 */
public class Producer implements Runnable {
    private Message msg = null;

    public Producer (Message msg) {
        this.msg = msg;
    }

    @Override
    public void run() {
        for (int i = 0 ; i < 30; i++) {
            if (i % 2 == 0) {
                this.msg.set("jack", "java programmer");
            } else {
                this.msg.set("tom", "python programmer");
            }
        }
    }
}
