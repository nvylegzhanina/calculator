
package com.company;

import java.util.Scanner;

/*
 * @author Natalia
 * @see getNumber()
 * */
public class Main {
    private static Scanner scanner;

    public static void main(String[] args) {
        scanner = new Scanner(System.in);
        System.out.println("Введите первое число");
        double firstNumber = getNumber();
        System.out.println("Введите второе число");
        double secondNumber = getNumber();

        double result = firstNumber + secondNumber;

        System.out.printf("%10.4f", result);
    }

    public static double getNumber(){
        double number = scanner.nextDouble();
        return number;
    }
}
