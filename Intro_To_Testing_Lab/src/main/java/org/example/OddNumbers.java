package org.example;

public class OddNumbers {

    public static int[] getOdds(int n) {
        if (n < 1) {
            return new int[0];
        }

        int size = (n + 1) / 2;
        int[] result = new int[size];

        int number = 1;
        for (int i = 0; i < size; i++) {
            result[i] = number;
            number += 2;
        }

        return result;
    }
}