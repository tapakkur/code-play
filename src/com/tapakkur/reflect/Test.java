package com.tapakkur.reflect;

/**
 * created by tapakkur on 2019/2/3
 */
public class Test {
    public static void main (String args[]) {
        Fruit apple = Factory.getInstance("com.tapakkur.reflect.Apple");
        Fruit orange = Factory.getInstance("com.tapakkur.reflect.Orange");
        apple.eat();
        orange.eat();
    }
}
