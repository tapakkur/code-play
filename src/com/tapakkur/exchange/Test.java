package com.tapakkur.exchange;

/**
 * created by tapakkur on 2019/1/29
 */
public class Test {

    public static void main (String args[]) {

        Integer a = new Integer(12);
        Integer b = 12;
        Integer c = 12;
        String s = "12";
        int x = a.intValue();
        int y = Integer.parseInt("10");
        int z = 100;
        System.out.println("x = " + x * 2);
        System.out.println("x + y = " + (x + y));
        String string = String.valueOf(z); // 将int转换为String
        System.out.println(Integer.parseInt(string.replace("0", "1")) + 1);
        int d = 12;
        int e = a; // 自动拆箱
        int f = a.intValue(); // 手动拆箱
//        System.out.println(a == b);
//        System.out.println(c == b);
//        System.out.println(a.equals(b));
//        System.out.println(a == d);
//        System.out.println(e == d);
//        System.out.println(e == b);
//        System.out.println(a == d);
//        System.out.println(a == f);
//        System.out.println(c == d);
    }
}
