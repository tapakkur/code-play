package com.tapakkur.binarySearch;

import java.util.Random;

/**
 * created by tapakkur on 2019/2/2
 */
public class Test {
    public static void main (String args[]) {
        int array[] = new int[10];
        random(array);
        int des = 6;
        if (binarySearch(array, des) != -1) {
            System.out.println("I have found the number of " + des);
        } else {
            System.out.println("I can not find the number of " + des);
        }
    }

    public static int binarySearch (int src[], int des) {
        int max = src.length - 1;
        int min = 0;
        while (min <= max) { // 确保不出现重复查找
            int mid = (max + min) >>> 1; // 右移1位，表示除以2，反之，则乘以2
            if (des == src[mid]) {
                return src[mid]; // 找到了
            } else if (des < src[mid]) {
                max = mid - 1; // 由于目标数据des比中间值还要小，所以数组下标的最大值定为原中间值的左边
            } else {
                min = mid + 1; //原中间值右边数组的下标为新的min
            }
        }
        return -1; // 如果未找到返回-1
    }

    public static void random (int src[]) {
        for (int i = 0; i < src.length; i++) {
            Random random = new Random();
            int val = random.nextInt(100);
            src[i] = val;
        }
        for (int i = 0; i < src.length; i++) {
            while (i < (src.length - 1)) {
                System.out.print(src[i] + ",");
            }
            System.out.print(src[i]);
        }
    }
}
