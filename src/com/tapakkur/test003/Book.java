package com.tapakkur.test003;

/**
 * created by tapakkur on 2019/1/26
 */
public class Book {
    private String title;
    private double price;

    public Book(){}

    public String getTitle() {
        return title;
    }

    public void setTitle(String title) {
        this.title = title;
    }

    public double getPrice() {
        return price;
    }

    public void setPrice(double price) {
        this.price = price;
    }

    public Book(String title, double price) {
        this.title = title;
        this.price = price;
    }

    public String getInfo() {
        return "book name: " + this.title + "book price: " + this.price;
    }

    public boolean compare (Book book) {
        if (book == null) return false; // 判断对象是否为空对象
        if (this == book) { // 判断新对象跟当前对象的hashcode地址是否相同，即内存地址相同
            return  true;
        }
        if (this.title.equals(book.title) && this.price == book.price) { // 判断所有属性是否相同
            return true;
        } else {
            return false;
        }
    }
}
