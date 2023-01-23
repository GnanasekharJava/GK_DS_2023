package com.arrays.practice;

import java.util.Arrays;
import java.util.Random;

public class Array04Example {
    public static void main(String[] args) {
        int[] newArray = {10, 34, 15, -37, -0, 100};
        genRandomNumberAndPrint(newArray);
    }

    private static void genRandomNumberAndPrint(int[] newArray) {
        if (newArray.length == 0) return;
        Random random = new Random();
        for (int i = 0; i < newArray.length; i++) {
            int newRandomNumber = random.nextInt(100);
            newArray[i] = newRandomNumber;

           // Arrays.fill(newArray,newRandomNumber);

            //System.out.println(Arrays.toString(newArray));
        }

        System.out.println(Arrays.toString(newArray));
    }
}
