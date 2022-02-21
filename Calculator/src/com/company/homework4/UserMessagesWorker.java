package com.company.homework4;

import java.util.Scanner;

public class UserMessagesWorker {
    private Scanner scanner;

    public UserMessagesWorker(){
        scanner = new Scanner(System.in);
    }

    public void sendMessageToUser(String message){
        System.out.println(message);
    }

    public double getDoubleFromUser(){
        double number = scanner.nextDouble();

        return number;
    }

    public String getStringFromUser(){
        String op = scanner.next();
        return op;
    }

    @Override
    protected void finalize() throws Throwable {
        scanner.close();
        super.finalize();
    }
}
