package com.arrays.practice;

import java.util.Arrays;

public class SecondLargestNumber {
    public static void main(String[] args) {
        int[] inputArray = {29,34,90,76,23,45};
        secondLargetStNumberInArray(inputArray);
    }

    /*private static void secondLargetStNumberInArray(int[] inputArray) {
        if(inputArray.length == 0)return;
        Arrays.sort(inputArray);
        System.out.println(inputArray[1]);//0(1)
    }*/

    private static void secondLargetStNumberInArray(int[] inputArray) {
        if(inputArray.length == 0){
            return;
        }
        int firstMax = inputArray[0];
        int secondMax = inputArray[0];
        int sevondmax = Math.min(firstMax, secondMax);
        System.out.println(sevondmax);
    }

}
