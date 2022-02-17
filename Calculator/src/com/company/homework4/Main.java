package com.company.homework4;

public class Main {
    public static void main(String[] args) {
        UserMessagesWorker umw = new UserMessagesWorker();
        Parser parser = new Parser();
        Calculator calc = new Calculator();
        Program pr = new Program(umw, calc, parser);
        pr.start();
    }
}
