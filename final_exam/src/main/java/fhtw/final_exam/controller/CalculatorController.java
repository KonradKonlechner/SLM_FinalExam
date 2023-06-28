package fhtw.final_exam.controller;

import fhtw.final_exam.service.CalculatorService;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

import java.time.LocalTime;

@RestController
@RequestMapping("/api")
public class CalculatorController {

    public final CalculatorService calculatorService;

    public CalculatorController(CalculatorService calculatorService) {
        this.calculatorService = calculatorService;
    }

    @RequestMapping("/calc/factorial")
    public int add(@RequestParam int x){
        return calculatorService.calcFactorial(x);
    }
}
