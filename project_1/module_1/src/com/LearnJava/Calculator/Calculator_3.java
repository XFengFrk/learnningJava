package com.LearnJava.Calculator;

import java.text.NumberFormat;
import java.util.Scanner;

public class Calculator_3 {
    public static void main(String[] args) {
        double p = InputAndCheckP();
        double mr = InputAndCheckMr();
        double m = InputAndCheckM();

        double payment = calculate(p, mr, m);

        System.out.println(NumberFormat.getCurrencyInstance().format(payment));

        printDetails(p, mr, m, payment);
    }
    static double InputAndCheckP() {
        Scanner scanner = new Scanner(System.in);
        System.out.print("请输入本金：");
        double p = scanner.nextDouble();
        if (p <= 0) {
//            System.out.println("贷款金额必须大于零");
            // throw new 异常类型("提示信息")
            throw new IllegalArgumentException("贷款金额必须大于零");
        }
        return p;
    }
    static double InputAndCheckMr() {
        Scanner scanner = new Scanner(System.in);
        System.out.print("请输入年利率（单位%）：");
        double yr = scanner.nextDouble();
        if (!(yr >= 1 && yr <= 36)) {
            throw new IllegalArgumentException("年利率必须是1%~36%");
        }
        return yr / 12.0 / 100;
    }
    static double InputAndCheckM() {
        Scanner scanner = new Scanner(System.in);

        System.out.print("请输入还款月数：");
        double m = scanner.nextInt();
        if (!(m >= 1 && m <= 360)) {
            throw new IllegalArgumentException("贷款月数必须在1~360之间");
        }
        return m;
    }
    static void printDetails(double p, double mr, double m, double payment) {
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

    /**
     * 以等额本息方式计算每月还款金额
     * @param p 本金
     * @param mr 月利率
     * @param m 还款月数
     * @return
     */
    static double calculate(double p, double mr, double m) {
        double pow = Math.pow(1 + mr, m);
        return p * mr * pow / (pow - 1);

    }
}
