package com.LearnJava.Calculator;

import java.text.NumberFormat;
import java.util.Scanner;

public class Calculator_2 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        double p = 0;
        double yr = 0;
        double mr = 0;
        double m = 0;
        double payment = 0;

        System.out.print("请输入本金：");
        p = scanner.nextDouble();
        if (!(p > 0)) {
            System.out.println("贷款金额必须大于零");
        }
        System.out.print("请输入年利率（单位%）：");
        yr = scanner.nextDouble();
        if (!(yr >= 1 && yr <= 36)) {
            System.out.println("年利率必须是1%~36%");
            }
        mr = yr / 12.0 / 100;
        System.out.print("请输入还款月数：");
        m = scanner.nextInt();
        if (!(m >= 1 && m <= 360)) {
            System.out.println("贷款月数必须在1~360之间");
        }
        double pow = Math.pow(1 + mr, m);

        payment = p * mr * pow / (pow - 1);

        System.out.println(NumberFormat.getCurrencyInstance().format(payment));

        for (int i = 0; i < m; i++) {
            double payInterest = p * mr; // 偿还利息
            double payPrincipal = payment - payInterest; // 偿还本金
            p -= payPrincipal; // 剩余本金
            System.out.print("月份:" + (i + 1));
            System.out.print("\t还款总额:" + NumberFormat.getCurrencyInstance().format(payment));
            System.out.print("\t偿还本金:" + NumberFormat.getCurrencyInstance().format(payPrincipal));
            System.out.print("\t偿还利息:" + NumberFormat.getCurrencyInstance().format(payInterest));
            System.out.println("\t剩余本金:" + NumberFormat.getCurrencyInstance().format(p));
        }
        System.out.println("还款总额:" + NumberFormat.getCurrencyInstance().format(payment * m));

    }
}
