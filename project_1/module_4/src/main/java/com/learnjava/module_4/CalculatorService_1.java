package com.learnjava.module_4;

import java.text.NumberFormat;

/**
 * 等额本金方式
 */
public class CalculatorService_1 implements CalculatorService {
    @Override
    public String[] cal(Calculator calculator){
        double yr = calculator.getYr();
        int m = calculator.getM();
        double p = calculator.getP();
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
    public String[][] details(Calculator calculator) {
        int m = calculator.getM();
        double yr = calculator.getYr();
        double p = calculator.getP();

        double payPrincipal = p / m; // 偿还本金
        double mr = yr / 12 / 100.0;
        String[][] row_2 = new String[m][];
        for (int i = 0; i < m; i ++) {
            double payInterest = p * mr; // 偿还利息
            p -= payPrincipal; // 剩余本金
            double payment = payPrincipal + payInterest; // 月供

            row_2[i] = createRow(i, payment, payPrincipal, payInterest, p);
        }
        return row_2;
    }
}
