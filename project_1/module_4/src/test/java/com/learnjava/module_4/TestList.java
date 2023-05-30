package com.learnjava.module_4;

import java.util.ArrayList;
import java.util.List;

public class TestList {
    public static void main(String[] args) {
        ArrayList<Integer> list_1 = new ArrayList<>();
        list_1.add(1);
        list_1.add(2);
        list_1.add(3);
        list_1.add(4);

        List<Integer> list_2 = List.of(1, 2, 3, 4);//元素一旦确定就不可变

        list_1.addAll(list_2);
        System.out.println(list_1);

        List<Integer> list_a = new ArrayList<>();
        list_a.addAll(List.of(1, 2, 3, 4));
        System.out.println(list_a);
    }
}