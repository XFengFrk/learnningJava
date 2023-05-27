package com.learnjava.module_2;

public class TestArray {
    public static void main(String[] args) {
        String[] a = new String[2];
        //1````````````````````````
        a[0] = "hello";
        a[1] = "wolrd";
        System.out.println(a[0]);
        System.out.println(a[1]);
        //2`````````````````````
        String[] b = new String[]{"hello", "wolrd"};
        System.out.println(b[0]);
        System.out.println(b[1]);
        //3`````````````````````````
        String[] c = {"hello", "wolrd"};
        System.out.println(c[0]);
        System.out.println(c[1]);
    }
}
