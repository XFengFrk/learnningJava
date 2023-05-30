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
        CalculatorService service = array[type];
        return service.cal(c);
    }
    //还款详情
    @RequestMapping("/details")
    @ResponseBody
    String[][] details(int type, Calculator c) {
        CalculatorService service = array[type];
        return service.details(c);
    }
}
