package com.learnjava.module_4;

public class TesrTry {

    public static void main(String[] args) {
        System.out.println(1);
        try {
            test(0.0);
        } catch (Exception e) {// 捕捉，获取异常对象，让程序恢复正常流程
            System.out.println(e);
        }
        System.out.println(3);
    }

    public static void test(double p) {
        if (p >= 0) {
            throw new IllegalArgumentException("p必须大于零");
        }
        System.out.println(2);
    }
}
