package com.learnjava.module_4;

import java.text.NumberFormat;

/**
 * 零利率方式
 */
public class CalculatorService_2 implements CalculatorService{
    public String[] cal(Calculator calculator){
        double p = calculator.getP();
        return new String[]{
                NumberFormat.getCurrencyInstance().format(p),
                "0"
        };
    }

    public String[][] details(Calculator calculator) {
        int m = calculator.getM();
        double p = calculator.getP();

        String[][] a2 = new String[m][];
        double payment = p / m;
        for (int i = 0; i < m; i++) {
            p -= payment;
            a2[i] = createRow(i, payment, payment, 0, p);
        }
        return a2;
    }
}
