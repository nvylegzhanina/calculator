package com.company.homework4;

import java.util.Scanner;

public class UserMessagesWorker {
    private static Scanner scanner;

    public void sendMessageToUser(String message){
        System.out.println(message);
    }

    public double getDoubleFromUser(){
        scanner = new Scanner(System.in);
        double number = scanner.nextDouble();
        scanner.close();

        return number;
    }

    public String getStringFromUser(){
        scanner = new Scanner(System.in);
        String op = scanner.next();
        scanner.close();

        return op;
    }
}
