package com.arrays.practice;

import java.util.Arrays;

public class ReverseArray {
    public static void main(String[] args) {
        int[] inputArray = {10, 20, 30, 79, 89, 60};
        reverseArray(inputArray);
    }
    private static void reverseArray(int[] inputArray) {
        if (inputArray.length == 0) return;
        int lowIndex = 0;
        int highIndex = inputArray.length-1;
        while (lowIndex < highIndex) {
            swapNumbers(inputArray, lowIndex, highIndex);
            lowIndex++;
            highIndex--;
        }

        System.out.println(Arrays.toString(inputArray));
    }

    private static void swapNumbers(int[] inputArray, int i, int i1) {

        int temp = inputArray[i];
        inputArray[i] = inputArray[i1];
        inputArray[i1] = temp;
    }
}
