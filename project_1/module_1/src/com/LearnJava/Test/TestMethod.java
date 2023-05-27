package com.LearnJava.Test;

public class TestMethod {
    static int add(int a, int b) {
        return a + b;
    }

    public static void main(String[] args) {
        int Sum = TestMethod.add(100, 200);
        System.out.println(Sum);
    }
}
