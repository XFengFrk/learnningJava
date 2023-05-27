package com.learnjava.module_3;

public class Cat extends Animal{
    public Cat(int type) {
        super(type);
    }
    @Override
    public void SayHi() {
        System.out.println("mewo! mewo!");
    }
}
