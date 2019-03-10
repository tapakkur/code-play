package com.tapakkur.exception;

/**
 * created by tapakkur on 2019/1/30
 */
public class Test {
    public static void main (String args[]) {
        try {
            int x = 10, y = 0;
            Math.add(x,y);
            Math.dev(x, y);
            throw new AddException("here is an exception");
        } catch (Exception e) {
            e.printStackTrace(); // 输出异常信息
        } finally {
            System.out.println("it is over");
        }
    }
}
