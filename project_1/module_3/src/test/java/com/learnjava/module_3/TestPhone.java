package com.learnjava.module_3;

public class TestPhone {
    public static void main(String[] args) {
        Phone p_1 = new Phone("苹果", "128G", "6.1寸", "星光色", 5799.0);
        Phone p_2 = new Phone("红米", "4G", "6.53寸", "金色", 1249.0);
        Phone p_3 = new Phone("华为", "4G", "6.3寸", "幻夜色", 999.0);

//        System.out.println(p_1.color);
//        System.out.println(p_1.price);
//
//        p_1.price = 3000;
//        System.out.println(p_1.price);
        System.out.println(p_1.available);
        System.out.println(p_2.available);
        System.out.println(p_3.available);
    }
}
