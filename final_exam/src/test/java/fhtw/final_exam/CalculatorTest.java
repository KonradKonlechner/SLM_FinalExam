package fhtw.final_exam;

import fhtw.final_exam.controller.CalculatorController;
import fhtw.final_exam.service.CalculatorService;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertEquals;

public class CalculatorTest {

    @Test
    public void calcFactorialofPositiveInteger(){
        // Arrange
        CalculatorController controller = new CalculatorController(new CalculatorService());
        int x = 5;

        // Act
        int result = controller.calculatorService.calcFactorial(x);
        // Assert
        assertEquals(120, result);
    }

}
