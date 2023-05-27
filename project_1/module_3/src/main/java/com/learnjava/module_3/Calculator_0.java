package com.learnjava.module_3;

import java.text.NumberFormat;

/**
 * 等额本息方式计算
 */
public class Calculator_0 extends Calculator {
    public Calculator_0(double p, int m, double yr) {
        super(p, m, yr);
    }
    @Override
    String[] cal() {
        double mr = yr / 12 / 100.0;
        double pow = Math.pow(1 + mr, m);
        double payment = p * mr * pow / (pow - 1);
        return new String[]{
                NumberFormat.getCurrencyInstance().format(payment * m),
                NumberFormat.getCurrencyInstance().format(payment * m - p)
        };
    }
    @Override
    String[][] details() {
        double mr = yr / 12 / 100.0;
        double pow = Math.pow(1 + mr, m);
        double payment = p * mr * pow / (pow - 1); // 月供
        String[][] row_2 = new String[m][];

        for (int i = 0; i < m; i++) {
            double payInterest = p * mr;
            double payPrincipal = payment - payInterest;
            p -= payPrincipal;

            row_2[i] = createRow(i, payment, payPrincipal, payInterest);
        }
        return row_2;
    }
}
