package com.learnjava.module_4;

import java.util.ArrayList;

public class TesrArrayList {
    public static void main(String[] args) {
        ArrayList list = new ArrayList(5);//初始容量5，默认初始容量10
        list.add("a");
        list.add("b");
        list.add("c");
        list.add("d");
        list.add("e");
        //内部封装了扩容逻辑，按1.5倍扩容
        list.add("f");

        System.out.println(list);

        for (Object e : list) {
            System.out.println(e);
        }
    }
}
