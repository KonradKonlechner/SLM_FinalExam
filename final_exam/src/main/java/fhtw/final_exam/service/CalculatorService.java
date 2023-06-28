package fhtw.final_exam.service;

import org.springframework.stereotype.Service;

@Service
public class CalculatorService {

    public int calcFactorial(int x) {
        int fact = 1;
        for(int i = x; i>0; i--) {
            fact*=i;
        }
        return fact;
    }
}
