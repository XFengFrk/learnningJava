package com.LearnJava.Calculator;

import java.text.NumberFormat;
import java.util.Scanner;
public class Calculator {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.print("请输入本金：");
        double p = scanner.nextDouble();
        System.out.print("请输入年利率（单位%）：");
        double yr = scanner.nextDouble();
        double mr = yr / 12.0 / 100;
        System.out.print("请输入还款月数：");
        double m = scanner.nextInt();
        double pow = Math.pow(1 + mr, m);

        Double payment = p * mr * pow / (pow - 1);

        System.out.println(NumberFormat.getCurrencyInstance().format(payment));

    }
}
