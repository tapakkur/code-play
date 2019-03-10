package com.tapakkur.test002;

/**
 * created by tapakkur on 2019/1/25
 */
class Person{
    private String name;
    private int age;

    public Person(){} //无参数构造函数
    public Person(String name, int age){
        this.name = name;
        this.age = age;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public int getAge() {
        return age;
    }

    public void setAge(int age) {
        this.age = age;
    }
}

class Student extends Person{
    private String school;
    public Student(){
        super();
    }
    public Student(String name, int age) {
        super(name, age);
    }

    public void setSchool(String school) {
        this.school = school;
    }

    public String getSchool() {
        return school;
    }
}
public class Main {
    public static void main(String args[]){
        int x,y;
        x = 1;
        y = 2;
//        System.out.println(add(x,y));
        Student student = new Student();
        student.setName(" ！ياخشىمۇسىز دۇنيا");
        student.setAge(25);
        student.setSchool("harvard school");
        System.out.println("学生姓名：" + student.getName() + "\n" +
                "学生年龄：" + student.getAge() + "\n" +
                "毕业院校：" + student.getSchool());
    }
    static int add(int a, int b){
        int sum = 0;
        sum = a + b;
        return sum;
    }
}
