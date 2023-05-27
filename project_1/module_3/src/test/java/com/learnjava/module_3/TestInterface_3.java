package com.learnjava.module_3;

public class TestInterface_3 {
    public static void main(String[] args) {
        M m = new N();
        m.m();
    }
}

interface M {
    void m();// public abstract
}

class N implements M {
    public String name;
    @Override
    public void m() {
        System.out.println("m");
    }

    public void n() {
        System.out.println("n");
    }
}