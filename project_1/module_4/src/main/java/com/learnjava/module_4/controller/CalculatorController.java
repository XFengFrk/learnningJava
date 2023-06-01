package com.learnjava.module_4.controller;

import com.learnjava.module_4.service.CalculatorService;
import com.learnjava.module_4.dto.Calculator;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;

@Controller
public class CalculatorController {
    /*private CalculatorService[] array = new CalculatorService[]{
            new CalculatorService_0(),
            new CalculatorService_1(),
            new CalculatorService_2()
    };*/
    @Autowired
    CalculatorService[] array;
    //还款总额
    @RequestMapping("/cal")
    @ResponseBody
    String[] cal(int type, Calculator c) {
        check(c.getP(), c.getM(), c.getYr(), type);
        CalculatorService service = array[type];
        return service.cal(c);
    }
    //还款详情
    @RequestMapping("/details")
    @ResponseBody
    String[][] details(int type, Calculator c) {
        check(c.getP(), c.getM(), c.getYr(), type);
        CalculatorService service = array[type];
        return service.details(c);
    }

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
        if (type != 1 && type != 0 && type != 2) {
            throw new IllegalArgumentException("不支持的还款类型");
        }
    }
}
