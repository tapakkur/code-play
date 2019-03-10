package com.tapakkur.emp;

/**
 * created by tapakkur on 2019/1/29
 */
public class Emp {
    private String name;
    private int age;
    private String sex;
    private String tel;

    public Emp () {
        //
    }

    public Emp(String name, int age, String sex, String tel) {
        this.name = name;
        this.age = age;
        this.sex = sex;
        this.tel = tel;
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

    public String getSex() {
        return sex;
    }

    public void setSex(String sex) {
        this.sex = sex;
    }

    public String getTel() {
        return tel;
    }

    public void setTel(String tel) {
        this.tel = tel;
    }

    @Override
    public String toString() {
        return "";
    }
}
