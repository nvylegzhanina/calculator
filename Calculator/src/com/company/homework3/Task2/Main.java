package com.company.homework3.Task2;

import java.util.ArrayList;

public class Main {
    public static void main(String[] args) {
       ArrayList<Sweet> sweeties = new ArrayList<Sweet>();
       sweeties.add(new Sweet(SweetType.Candy, "Конфета 2222", 2.2, 1));
       sweeties.add(new Sweet(SweetType.Marmalade, "Мармелад 3000", 8.8, 8));
       sweeties.add(new Sweet(SweetType.Cheese, "Сыр 1", 5, 13.3));
       sweeties.add(new Sweet(SweetType.Jellybean, "Jellybean 2222", 1, 3));

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

    public static class Sweet {
        private SweetType type;
        private double weight;
        private double price;
        private String name;

        public Sweet(SweetType type, String name, double weight, double price){

            this.type = type;
            this.name = name;
            this.weight = weight;
            this.price = price;
        }
        public SweetType getType() {
            return type;
        }

        public double getWeight() {
            return weight;
        }

        public double getPrice() {
            return price;
        }

        public String getName() {
            return name;
        }
    }

    public enum SweetType{
        Candy,
        Jellybean,
        Marmalade,
        Cheese
    }
}


