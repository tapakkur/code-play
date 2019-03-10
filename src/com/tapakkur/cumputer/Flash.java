package com.tapakkur.cumputer;

/**
 * created by tapakkur on 2019/1/28
 */
public class Flash implements USB {
    @Override
    public void start() {
        System.out.println("the flash is working now...");
    }

    @Override
    public void stop() {
        System.out.println("the flash is stopped working...");
    }
}
