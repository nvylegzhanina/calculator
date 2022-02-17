package com.company.homework4;

public class Parser {
    public Operations parseUserResponse(String op){
        switch (op){
            case "+": return Operations.Plus;
            case "-": return Operations.Minus;
            case "*": return Operations.Multiply;
            case "/": return Operations.Divide;
            default: throw new IllegalArgumentException();
        }
    }
}
