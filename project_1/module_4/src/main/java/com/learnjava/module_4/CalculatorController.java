package com.learnjava.module_4;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;

@Controller
public class CalculatorController {
    private CalculatorService[] array = new CalculatorService[]{
            new CalculatorService_0(),
            new CalculatorService_1(),
            new CalculatorService_2()
    };
    //还款总额
    @RequestMapping("/cal")
    @ResponseBody
    String[] cal(double p, int m, double yr, int type) {
        CalculatorService service = array[type];
        return service.cal(new Calculator(p, m, yr));
    }
    //还款详情
    @RequestMapping("/details")
    @ResponseBody
    String[][] details(double p, int m, double yr, int type) {
        CalculatorService service = array[type];
        return service.details(new Calculator(p, m, yr));
    }
}
