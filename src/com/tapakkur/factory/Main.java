package com.tapakkur.factory;

/**
 * @author tapakkur
 * @ProjectName codePlay
 * @Date 2019/2/19 11:10
 */

interface Fruit {
    public void eat();
}

class Apple implements Fruit {
    @Override
    public void eat() {
        System.out.println("eat an apple");
    }
}

class Orange implements Fruit{
    @Override
    public void eat() {
        System.out.println("ean an orange");
    }
}

class FruitFactory{
    public static Fruit getFruit(String className) {
        if ("apple".equals(className)) {
            return new Apple();
        } else if ("orange".equals(className)){
            return new Orange();
        } else {
            return null;
        }
    }
}
public class Main {
    public static void main(String[] args) {
        String className = "apple";
        Fruit fruit = FruitFactory.getFruit(className);
        fruit.eat();

    }
}
