package com.learnjava.module_4;

import java.text.NumberFormat;

/**
 * 等额本息方式
 */
public class CalculatorService_0 implements CalculatorService{
    @Override
    public String[] cal(Calculator calculator){
        double yr = calculator.getYr();
        int m = calculator.getM();
        double p = calculator.getP();
        double mr = yr / 12 / 100.0;
        double pow = Math.pow(1 + mr, m);
        double payment = p * mr * pow / (pow - 1);
        return new String[]{
                NumberFormat.getCurrencyInstance().format(payment * m),
                NumberFormat.getCurrencyInstance().format(payment * m - p)
        };
    }
    @Override
    public String[][] details(Calculator calculator) {
        int m = calculator.getM();
        double yr = calculator.getYr();
        double p = calculator.getP();

        double mr = yr / 12 / 100.0;
        double pow = Math.pow(1 + mr, m);
        double payment = p * mr * pow / (pow - 1); // 月供
        String[][] row_2 = new String[m][];

        for (int i = 0; i < m; i++) {
            double payInterest = p * mr;
            double payPrincipal = payment - payInterest;
            p -= payPrincipal;

            row_2[i] = createRow(i, payment, payPrincipal, payInterest, p);
        }
        return row_2;
    }
}
