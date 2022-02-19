package tests;

import com.company.homework4.Calculator;
import org.junit.Assert;
import org.junit.Before;
import org.junit.Test;

public class CalculatorTests {
    private Calculator calculator;

    @Before
    public void setUp() {
        calculator = new Calculator();
    }

    @Test
    public void shouldCorrectSumTwoNumbers() {
        double firstNumber = 5;
        double secondNumber = 10;

        double result = calculator.sum(firstNumber, secondNumber);

        Assert.assertEquals(15, result, 0);
    }

    @Test
    public void shouldCorrectSumTwoFloatNumbers() {
        double firstNumber = 5.7;
        double secondNumber = 10.3;

        double result = calculator.sum(firstNumber, secondNumber);

        Assert.assertEquals(16, result, 0);
    }

    @Test
    public void shouldCorrectMinusTwoNumbers() {
        double firstNumber = 5;
        double secondNumber = 10;

        double result = calculator.minus(firstNumber, secondNumber);

        Assert.assertEquals(-5, result, 0);
    }

    @Test
    public void shouldCorrectMultiplyTwoNumbers() {
        double firstNumber = 5;
        double secondNumber = 10;

        double result = calculator.multiply(firstNumber, secondNumber);

        Assert.assertEquals(50, result, 0);
    }

    @Test
    public void shouldCorrectDivideTwoNumbers() {
        double firstNumber = 10;
        double secondNumber = 5;

        double result = calculator.divide(firstNumber, secondNumber);

        Assert.assertEquals(2, result, 0);
    }

    @Test
    public void shouldThrowExceptionWhenDivideToZero() {
        double firstNumber = 10;
        double secondNumber = 0;

        Assert.assertThrows(ArithmeticException.class, () -> calculator.divide(firstNumber, secondNumber));
    }
}
