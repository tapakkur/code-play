package com.tapakkur.mapreduce;

import java.util.DoubleSummaryStatistics;
import java.util.List;
import java.util.ArrayList;

/**
 * created by tapakkur on 2019/2/7
 */
public class Test {
    public static void main (String args[]) {
        List<Orders> all = new ArrayList<Orders>();
        all.add(new Orders("java开发经典",100.23,100));
        all.add(new Orders("python开发经典",120.23,120));
        all.add(new Orders("c++开发经典",134.23,78));
        all.add(new Orders("go语言开发经典",178.23,70));
        DoubleSummaryStatistics dsc = all.stream().mapToDouble((sc)-> sc.getAmount() * sc.getPrice())
                .summaryStatistics(); // 数据统计
        System.out.println("商品个数：" + dsc.getCount());
        System.out.println("商品总价：" + dsc.getSum());
        System.out.println("商品均价：" + dsc.getAverage());
        System.out.println("商品max：" + dsc.getMax());
        System.out.println("商品min：" + dsc.getMin());
    }
}
