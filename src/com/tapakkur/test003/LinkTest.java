package com.tapakkur.test003;

/**
 * created by tapakkur on 2019/1/26
 */
public class LinkTest {
    public static void main (String args[]) {
        Book book1 = new Book("java 开发", 23.45); // 先声明对象，然后实例化，再初始化
        Book book2 = new Book("android 开发", 23.45); // 先声明对象，然后实例化，再初始化
        Book book3 = new Book("python 开发", 23.45); // 先声明对象，然后实例化，再初始化
        Link link = new Link();
        link.add(book1);
        link.add(book2);
        link.add(book3);
        int size = link.size();
        System.out.println("链表的长度：" + size);
        Book data1 = new Book("java 开发",23.45);
        Book data2 = new Book("python 开发",23.45);
        System.out.println(link.contains(data1));
        System.out.println(link.contains(data2));
        link.delete(book1);
        System.out.println("已经删除一条数据...");
        Book [] books = link.toArr();
        System.out.println("数字内容如下：\n");
        for (int i = 0; i < books.length; i++) {
            System.out.println(books[i].getInfo());
        }
    }
}
