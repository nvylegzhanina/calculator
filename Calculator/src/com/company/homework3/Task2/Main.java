package com.company.homework3.Task2;


import java.util.ArrayList;

public class Main {
    public static void main(String[] args) {
        ArrayList<Sweet> sweeties = new ArrayList<Sweet>();
        sweeties.add(new Chocolate(2.2, 1, "Шоколад 2222", 322));
        sweeties.add(new JellyBeans(8.8, 8, "Мармелад 3000", "nestle"));
        sweeties.add(new Candy(5, 13.3, "Конфета 1", "Russia"));

        Gift gift = new Gift(sweeties);

        System.out.println("Цена подарка:" + gift.getPrice());
        System.out.println("Вес подарка:" + gift.getWeight());
        System.out.println("В подарке следующие сладости:");
        for (int i = 0; i < gift.sweeties.size(); i++){
            Sweet sweet = gift.sweeties.get(i);
            System.out.println(sweet.name);
        }
    }
    public static class Gift {
        private ArrayList<Sweet> sweeties;

        public Gift(ArrayList<Sweet> sweeties){

            this.sweeties = sweeties;
        }

        public ArrayList<Sweet> getSweeties() {
            return sweeties;
        }

        public double getWeight(){
            double result = 0;
            for (int i = 0; i < sweeties.size(); i++){
                Sweet sweet = sweeties.get(i);
                result += sweet.weight;
            }

            return result;
        }

        public double getPrice(){
            double result = 0;
            for (int i = 0; i < sweeties.size(); i++){
                Sweet sweet = sweeties.get(i);
                result += sweet.price;
            }

            return result;
        }
    }

    public static abstract class Sweet {
        double weight;
        double price;
        String name;
    }

    public static class JellyBeans extends Sweet {
        private final String tradeMark;

        public JellyBeans(double weight, double price, String name, String tradeMark){
            this.name = name;
            this.weight = weight;
            this.price = price;
            this.tradeMark = tradeMark;
        }
    }

    public static class Candy extends Sweet {
        private final String producerCountry;

        public Candy(double weight, double price, String name, String producerCountry){
            this.name = name;
            this.weight = weight;
            this.price = price;
            this.producerCountry = producerCountry;
        }
    }

    public static class Chocolate extends Sweet {
        private final int calories;

        public Chocolate(double weight, double price, String name, int calories){
            this.name = name;
            this.weight = weight;
            this.price = price;
            this.calories = calories;
        }
    }
}