package com.tapakkur.mathRandom;

import java.util.Arrays;
import java.util.Random;

/**
 * created by tapakkur on 2019/2/2
 */
public class Test {
    public static void main (String args[]) {
        Random random = new Random();
        int array [] = new int[7];
        int index = 0;
        while (index < 7) {
            int num = random.nextInt(37); // 取随机的整数
            if (! isRepeat(array, num)) {
                array[index++] = num;
            }
        }
        Arrays.sort(array); // 排序
        reverse(array); // 倒序
        for (int i = 0; i < array.length; i++) {
            if (i == array.length-1) {
                System.out.println(array[i]);
            } else {
                System.out.print(array[i] + ", ");
            }
        }
    }

    public static boolean isRepeat (int temp[] , int num) {
        if (num == 0) {
            return true;
        }
        for (int i = 0; i < temp.length; i++) {
            if (temp[i] == num) {
                return true; // 如果重复了，则不再执行后面的
            }
        }
        return false;
    }

    public static void reverse (int array[]) {
        int len = array.length;
        int head = 0;
        int tail = len - 1;
        for (int i = 0; i < len / 2; i++) {
            int temp = array[head];
            array[head] = array[tail];
            array[tail] = temp;
            System.out.println("刚交换了数组首位的" + array[tail] + "和尾部的" + array[head]); // 注意交换后首尾变化
            head++;
            tail--;
        }
    }
}
