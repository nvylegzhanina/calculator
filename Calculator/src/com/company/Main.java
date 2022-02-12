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
        int taskNumber = getTaskNumber();

        switch (taskNumber){
            case 1: RunCalculatorTask(); break;
            case 2: RunMaxArrayNumberTask(); break;
            default:
                System.out.println("Неправильный номер задачи");
        }
    }

    private static void RunMaxArrayNumberTask() {
        System.out.println("Введите размер массива");
        int arraySize = scanner.nextInt();
        String[] array = new String[arraySize];

        int maxLength = 0;
        String maxLengthWord = "";

        for (int i = 0; i < arraySize; i++){
            System.out.println("Введите слово");
            array[i] = scanner.next();

            if (array[i].length() > maxLength){
                maxLength = array[i].length();
                maxLengthWord = array[i];
            }
        }

        System.out.println(maxLengthWord);
    }

    private static void RunCalculatorTask() {
        System.out.println("Введите первое число");
        double firstNumber = getNumber();
        System.out.println("Введите операцию");
        String op = scanner.next();
        System.out.println("Введите второе число");
        double secondNumber = getNumber();
        scanner.close();

        if (op.length() > 1)
            throw new IllegalArgumentException();

        double result;

        switch (op){
            case "+": result = firstNumber + secondNumber; break;
            case "-": result = firstNumber - secondNumber; break;
            case "*": result = firstNumber * secondNumber; break;
            case "/": result = firstNumber / secondNumber; break;
            default: throw new IllegalArgumentException();
        }

        System.out.printf("%10.4f", result);
    }

    public static double getNumber(){
        double number = scanner.nextDouble();
        return number;
    }

    private static int getTaskNumber(){
        System.out.println("Enter number of task: (1 - calculator, 2 - string array)");
        return scanner.nextInt();
    }
}
