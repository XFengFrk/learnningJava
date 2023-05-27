package com.learnjava.module_3;

public class TestInterface_1 {
    public static void main(String[] args) {
        Duck duck = new Duck();

        duck.fly();
        duck.swim();
    }
}
interface Swimmable {
    default void swim() {
        System.out.println("游泳");
    }
}

interface Flyable {
    default void fly() {
        System.out.println("飞翔");
    }
}

class Duck implements Swimmable, Flyable {

}
