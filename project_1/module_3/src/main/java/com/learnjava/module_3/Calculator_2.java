package com.learnjava.module_3;

import java.text.NumberFormat;

/**
 * 零息还款
 */
public class Calculator_2 extends Calculator {
    public Calculator_2(double p, int m, double yr) {
        super(p, m, yr);
    }

    @Override
    String[] cal() {//0 还款总额 1 还款总利息
        return new String[]{
                NumberFormat.getCurrencyInstance().format(p),
                "0"
        };
    }

    @Override
    String[][] details() {
        String[][] a2 = new String[m][];
        double payment = p / m;
        for (int i = 0; i < m; i++) {
            p -= payment;
            a2[i] = createRow(i, payment, payment, 0);
        }
        return a2;
    }
}
