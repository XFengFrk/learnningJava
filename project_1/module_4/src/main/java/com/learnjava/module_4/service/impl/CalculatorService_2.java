package com.learnjava.module_4.service.impl;

import com.learnjava.module_4.dto.Calculator;
import com.learnjava.module_4.service.CalculatorService;
import org.springframework.stereotype.Service;

import java.text.NumberFormat;

/**
 * 零利率方式
 */
@Service
public class CalculatorService_2 implements CalculatorService {
    @Override
    public String[] cal(Calculator calculator){
        double p = calculator.getP();
        return new String[]{
                NumberFormat.getCurrencyInstance().format(p),
                "0"
        };
    }
    @Override
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
