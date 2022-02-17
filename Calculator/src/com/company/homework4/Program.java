package com.company.homework4;

import sun.reflect.generics.reflectiveObjects.NotImplementedException;

public class Program {
    private UserMessagesWorker userMessagesWorker;
    private Calculator calculator;
    private Parser parser;

    public Program(UserMessagesWorker userMessagesWorker,
                   Calculator calculator, Parser parser){

        this.userMessagesWorker = userMessagesWorker;
        this.calculator = calculator;
        this.parser = parser;
    }
    public void start(){
        userMessagesWorker.sendMessageToUser("Введите первое число");
        double firstNumber = userMessagesWorker.getDoubleFromUser();
        userMessagesWorker.sendMessageToUser("Введите операцию");
        String op = userMessagesWorker.getStringFromUser();
        Operations operation = parser.parseUserResponse(op);
        userMessagesWorker.sendMessageToUser("Введите второе число");
        double secondNumber = userMessagesWorker.getDoubleFromUser();

        double result;

        switch (operation){
            case Plus: result = calculator.sum(firstNumber, secondNumber); break;
            case Minus: result = calculator.minus(firstNumber, secondNumber);  break;
            case Multiply: result = calculator.multiply(firstNumber, secondNumber); break;
            case Divide: result = calculator.divide(firstNumber, secondNumber); break;
            default: throw new NotImplementedException();
        }

        userMessagesWorker.sendMessageToUser("Результат: " + result);
    }
}
