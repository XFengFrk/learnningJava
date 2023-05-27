package com.learnjava.module_3;

public class Dog extends Animal{


    public Dog(int type) {
        super(type);
    }

    @Override
    public void SayHi() {
        System.out.println("wolf! wolf!");
    }
}
