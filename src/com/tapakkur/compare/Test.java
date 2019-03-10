package com.tapakkur.compare;

import java.util.Arrays;

/**
 * created by tapakkur on 2019/2/3
 */
class Book implements Comparable<Book> {
    private String title;
    private double price;

    public Book () {
        //
    }
    public Book(String title, double price) {
        this.title = title;
        this.price = price;
    }

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

    @Override
    public String toString() {
        return "title : " + this.title + ", price : $" + this.price + "\n";
    }

    @Override
    public int compareTo(Book o) {
        if (this.price > o.price) {
            return 1;
        } else if (this.price < o.price) {
            return -1;
        } else {
            return 0;
        }
    }
}

class Student implements Comparable<Student> {
    private String name;
    private Integer age; // 默认为null，适合数据库表列
    private String sex;

    public Student () {
        //
    }

    public Student (String name, Integer age, String sex) {
        this.name = name;
        this.age = age;
        this.sex = sex;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public Integer getAge() {
        return age;
    }

    public void setAge(Integer age) {
        this.age = age;
    }

    public String getSex() {
        return sex;
    }

    public void setSex(String sex) {
        this.sex = sex;
    }

    @Override
    public String toString() {
        return "name : " + this.name + ", age : " + this.age + ", sex : " + this.sex + "\n";
    }

    @Override
    public int compareTo(Student o) {
        if (this.age > o.age) return 1;
        else if (this.age < o.age) return -1;
        else return 0;
    }
}
public class Test {

    public static void main (String args[]) {
        Book book[] = new Book[] {
                new Book("java", 43.45),
                new Book("java", 23.45),
                new Book("java", 33.45),
                new Book("java", 53.45),
        };
        Student students[] = new Student[] {
                new Student("jack", 23, "male"),
                new Student("tom", 22, "male"),
                new Student("mary", 25, "female")
        };
        Arrays.sort(book);
        Arrays.sort(students);
//        System.out.println(Arrays.toString(book));
        System.out.println(Arrays.toString(students));
    }
}
