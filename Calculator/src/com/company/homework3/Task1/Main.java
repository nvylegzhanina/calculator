package com.company.homework3.Task1;

import java.util.Random;

public class Main {
    public static void main(String[] args) {
        Random random = new Random();
        int[] arr = new Random().ints(20, -10, 10).toArray();

        int maxMinusNumber = 100;
        int minPlusNumber = 100;
        int minNumberPlusIndex = -100;
        int maxNumberMinusIndex = -100;
        for (int i = 0; i < arr.length; i++){
            int number = arr[i];

            if (number > 0) {
                if (minPlusNumber > number)
                {
                    minPlusNumber = number;
                    minNumberPlusIndex = i;
                }
            }
            else {
                if (maxMinusNumber > number)
                {
                    maxMinusNumber = number;
                    maxNumberMinusIndex = i;
                }
            }
        }

        arr[minNumberPlusIndex] = maxMinusNumber;
        arr[maxNumberMinusIndex] = minPlusNumber;
    }
}
