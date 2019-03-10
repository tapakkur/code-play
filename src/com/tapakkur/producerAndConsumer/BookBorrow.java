package com.tapakkur.producerAndConsumer;

/**
 * created by tapakkur on 2019/2/1
 */
class Book {
    private String name;
    private String No;
    private double price;
    private boolean flag = true;

//    public Book (String name, String No, double price) {
//        this.name = name;
//        this.No = No;
//        this.price = price;
//    }

    public void setName(String name) {
        this.name = name;
    }

    public String getName() {
        return name;
    }

    public void setNo(String no) {
        No = no;
    }

    public String getNo() {
        return No;
    }

    public void setPrice(double price) {
        this.price = price;
    }

    public double getPrice() {
        return price;
    }

    public synchronized void set (String name, String No, double price) {
        if (this.flag == false) {
            try {
                super.wait();
            } catch (InterruptedException e) {
                e.printStackTrace();
            }
        }
        this.name = name;
        try {
            Thread.sleep(1000);
        } catch (InterruptedException e) {
            e.printStackTrace();
        }
        this.No = No;
        try {
            Thread.sleep(1000);
        } catch (InterruptedException e) {
            e.printStackTrace();
        }
        this.price = price;
        this.flag = false;
        super.notify();
    }

    public synchronized void get () {
        if (this.flag == true) {
            try {
                super.wait();
            } catch (InterruptedException e ) {
                e.printStackTrace();
            }
        }
        System.out.println("Book information : \n name: " + this.name +
                "\n No:  " + this.No + "\n price: $" + this.price);
        this.flag = true;
        super.notify();
    }
}

class GiveBack implements Runnable {
    private Book book = null;

    public GiveBack (Book book) {
        this.book = book;
    }

    @Override
    public void run() {
        for (int i = 0; i < 30; i++) {
            this.book.get();
        }
    }
}

class BorrowBook implements Runnable {
    private Book book = null;

    public BorrowBook (Book book) {
        this.book = book;
    }

    @Override
    public void run() {
        for (int i = 0; i < 30; i++) {
            if ( i % 2 == 0) {
                this.book.set("java", "B1001", 23.67);
            } else {
                this.book.set("python", "B002", 45.32);
            }
        }
    }
}
public class BookBorrow {
    public static void main (String args[]) {
        Book book = new Book();
        new Thread(new BorrowBook(book)).start();
        new Thread(new GiveBack(book)).start();
    }
}
