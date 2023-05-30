package com.learnjava.module_4;

import java.util.ArrayList;

/**
 * 泛型
 */
public class TestGeneric {
    public static void main(String[] args) {
        /*ArrayList list = new ArrayList();
        list.add(1);//int => Integer => Object
        list.add(2);
        list.add(3);
        list.add(4);

        int sum = 0;
        for (Object e : list) {
//          System.out.println(e);
            sum += (Integer) e;
        }*/
        ArrayList<Integer> list = new ArrayList<>();
        list.add(1);
        list.add(2);
        list.add(3);
        list.add(4);

        int sum = 0;
        for (Integer i : list) {
            sum += i;
        }
        System.out.println(sum);
    }
}
