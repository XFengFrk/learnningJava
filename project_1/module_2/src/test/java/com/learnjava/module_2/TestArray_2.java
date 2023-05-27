package com.learnjava.module_2;

public class TestArray_2 {
    public static void main(String[] args) {
        // 1. 数组的长度
        String[] a = new String[]{"北京", "上海", "深圳"};
        System.out.println("数组的长度:" + a.length);
        // 2. 数组越界
//        System.out.println(a[3]);// ArrayIndexOutOfBoundsException 数组索引越界异常
        // 3. 遍历数组
        for (String s : a) {
            System.out.println(s);
        }
        // 4. 默认值
        String[] b = new String[3];
        System.out.println(b);
        for (String s : b) {
            System.out.println(s);
        }
    }
}
