package com.company.homework4;

public class Calculator {
    public double sum(double firstNumber, double secondNumber){
        return firstNumber + secondNumber;
    }

    public double minus(double firstNumber, double secondNumber){
        return firstNumber - secondNumber;
    }

    public double divide(double firstNumber, double secondNumber){
        if (secondNumber == 0)
            throw new ArithmeticException();

        return firstNumber / secondNumber;
    }

    public double multiply(double firstNumber, double secondNumber){
        return firstNumber * secondNumber;
    }
}
