package com.LearnJava.Test;

import java.text.NumberFormat;

public class TestFormat {
    public static void main(String[] args) {
        String format = NumberFormat.getCurrencyInstance().format(11991.010503055139);
        System.out.print(format);
    }
}
