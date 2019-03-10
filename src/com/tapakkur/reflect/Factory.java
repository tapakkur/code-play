package com.tapakkur.reflect;

/**
 * created by tapakkur on 2019/2/3
 */
public class Factory {
    public static Fruit getInstance (String className) {
        Fruit fruit = null;
        try {
            fruit = (Fruit) Class.forName(className).newInstance();
        } catch (Exception e) {
            e.printStackTrace();
        }
        return fruit;
    }
}
