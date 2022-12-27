package com.example.controller;

import com.example.service.Calculator;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;

@Controller
@RequestMapping("/calculator")
public class CalculatorController {
    @GetMapping("")
    public String showCalculator() {
        return "/home";
    }

    @PostMapping("")
    public String calculate(@RequestParam("number1") Integer num1,
                            @RequestParam("number2") Integer num2,
                            @RequestParam("math") String math, Model model) {
        Calculator calculator = new Calculator();
        Integer result = null;
        switch (math) {
            case "+":
                result = calculator.addition(num1, num2);
                break;
            case "-":
                result = calculator.subtraction(num1, num2);
                break;
            case "*":
                result = calculator.multiplication(num1, num2);
                break;
            case "/":
                result = calculator.division(num1, num2);
                break;
        }
        model.addAttribute("result", result);
        model.addAttribute("num1", num1);
        model.addAttribute("num2", num2);
        return "/home";
    }
}
