package com.arrays.practice;

import java.util.Arrays;
import java.util.Random;

public class Arrays05Example {
    public static void main(String[] args) {
        int[] inputArray = {25,78,90,34,26,100};
        Random random = new Random();
        random.nextInt(100);
       // Arrays.hashCode(inputArray);
        System.out.println(Arrays.binarySearch(inputArray, 90));
        Arrays.sort(inputArray, 0, inputArray.length);
        System.out.println(Arrays.toString(inputArray));
     //  System.out.println(Arrays.hashCode(inputArray));

    }
}
