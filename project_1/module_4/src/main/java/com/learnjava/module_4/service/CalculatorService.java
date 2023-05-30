package com.learnjava.module_4.service;

import com.learnjava.module_4.dto.Calculator;

import java.text.NumberFormat;

/**
 * 业务逻辑接口
 */
public interface CalculatorService {
    String[] cal(Calculator calculator);
    String[][] details(Calculator calculator);
    default String[] createRow(int i, double payment, double payPrincipal, double payInterest, double p) {
        String[] row = new String[]{
                (i + 1) + "",
                NumberFormat.getCurrencyInstance().format(payment),
                NumberFormat.getCurrencyInstance().format(payPrincipal),
                NumberFormat.getCurrencyInstance().format(payInterest),
                NumberFormat.getCurrencyInstance().format(p)
        };
        return row;
    }
}
