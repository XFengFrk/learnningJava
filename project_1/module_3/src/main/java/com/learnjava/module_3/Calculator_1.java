package com.learnjava.module_3;

import java.text.NumberFormat;

/**
 *等额本金的计算方式
 */
public class Calculator_1 extends Calculator {
    public Calculator_1(double p, int m, double yr) {
        super(p, m, yr);
    }
    @Override
    String[] cal() {
        double mr = yr / 12 / 100.0;
        double payPrincipal = p / m;
        double backup = p;// 备份本金
        double payIntresetTotal = 0;
        for (int i = 0; i < m; i ++) {
            double payIntreset = p * mr;
            p -= payPrincipal;
            payIntresetTotal += payIntreset;
        }
        return new String[]{
                NumberFormat.getCurrencyInstance().format(backup + payIntresetTotal),
                NumberFormat.getCurrencyInstance().format(payIntresetTotal)
        };
    }
    @Override
    String[][] details() {
        // 等额本金
        double payPrincipal = p / m; // 偿还本金
        double mr = yr / 12 / 100.0;
        String[][] row_2 = new String[m][];
        for (int i = 0; i < m; i ++) {
            double payInterest = p * mr; // 偿还利息
            p -= payPrincipal; // 剩余本金
            double payment = payPrincipal + payInterest; // 月供

            row_2[i] = createRow(i, payment, payPrincipal, payInterest);
        }
        return row_2;
    }
}
