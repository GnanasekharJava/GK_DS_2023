package com.arrays.practice;

import java.util.Arrays;

public class Array02Example {

    public static void main(String[] args) {
        int[] parathensisArray = {10,20,30,4,5,9,10,12,16};
        squareAndPrintArray(parathensisArray);
    }

    private static void squareAndPrintArray(int[] parathensisArray) {
        System.out.println(Arrays.toString(parathensisArray));

        for (int i = 0; i <parathensisArray.length ; i++) {
            int squareNumber = parathensisArray[i] * parathensisArray[i];
            parathensisArray[i] = squareNumber;
        }

        System.out.println(Arrays.toString(parathensisArray));

    }
}
