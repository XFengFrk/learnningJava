package com.learnjava.module_2;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;

import java.text.NumberFormat;

@Controller
public class CalController {

    static void check(double p, double m, double yr, int type) {
        if (p <= 0) {
            throw new IllegalArgumentException("贷款金额必须大于零");
        }
        if (m < 1 || m > 360) {
            throw new IllegalArgumentException("贷款月份必须1~360之间");
        }
        if (yr < 1 || yr > 36) {
            throw new IllegalArgumentException("年利率必须在1~36之间");
        }
        if (type != 1 && type != 0) {
            throw new IllegalArgumentException("不支持的还款类型");
        }
    }

    /**
     * 以等额本息法计算还款总额和总利息
     * @param p 本金
     * @param m 月份
     * @param yr 年利率
     * @return [0]还款总额 [1]总利息
     */
    static String[] cal_0(double p, int m, double yr) {
        double mr = yr / 12 / 100.0;
        double pow = Math.pow(1 + mr, m);
        double payment = p * mr * pow / (pow - 1);
        //return NumberFormat.getCurrencyInstance().format(payment * m);
        return new String[]{
                NumberFormat.getCurrencyInstance().format(payment * m),
                NumberFormat.getCurrencyInstance().format(payment * m - p)
        };
    }
    /**
     * 以等额本金法计算还款总额和总利息
     * @param p 本金
     * @param m 月份
     * @param yr 年利率
     * @return [0]还款总额 [1]总利息
     */
    static String[] cal_1(double p, int m, double yr) {
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

    @RequestMapping("/cal")
    @ResponseBody
    String[] cal(double p, int m, double yr, int type) {
        check(p, m, yr, type);
        if (type == 0) {
            return cal_0(p, m, yr);

        } else {
            return cal_1(p, m, yr);
        }
    }

    static String[][] details_1(double p, int m, double yr) {
        // 等额本金
        double payPrincipal = p / m; // 偿还本金
        double mr = yr / 12 / 100.0;
        String[][] row_2 = new String[m][];
        for (int i = 0; i < m; i ++) {
            double payInterest = p * mr; // 偿还利息
            p -= payPrincipal; // 剩余本金
            double payment = payPrincipal + payInterest; // 月供
            String[] row = new String[] {
                    (i + 1) + "",
                    NumberFormat.getCurrencyInstance().format(payment),
                    NumberFormat.getCurrencyInstance().format(payPrincipal),
                    NumberFormat.getCurrencyInstance().format(payInterest),
                    NumberFormat.getCurrencyInstance().format(p)
            };
            row_2[i] = row;
        }
        return row_2;
    }

    static String[][] details_0(double p, int m, double yr) {
        double mr = yr / 12 / 100.0;
        double pow = Math.pow(1 + mr, m);
        double payment = p * mr * pow / (pow - 1); // 月供
        String[][] row_2 = new String[m][];

        for (int i = 0; i < m; i++) {
            double payInterest = p * mr;
            double payPrincipal = payment - payInterest;
            p -= payPrincipal;
            String[] row = new String[]{
                    (i + 1) + "",
                    NumberFormat.getCurrencyInstance().format(payment),
                    NumberFormat.getCurrencyInstance().format(payPrincipal),
                    NumberFormat.getCurrencyInstance().format(payInterest),
                    NumberFormat.getCurrencyInstance().format(p)
            };
            row_2[i] = row;
        }
        return row_2;
    }

    @RequestMapping("/details")
    @ResponseBody
    String[][] details(double p, int m, double yr, int type) {
        check(p, m, yr, type);
        if (type == 0) {
            return details_0(p, m, yr);
        } else {
            return details_1(p, m, yr);
        }
    }

}
