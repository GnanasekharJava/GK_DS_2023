package com.arrays.practice;

import java.util.Arrays;

public class Array03Example {
    public static void main(String[] args) {
        double[] newArray = {10,3,17,25,18,20,34,90,24};
        powerWithPrintArray(newArray);
    }

    private static void powerWithPrintArray(double[] newArry) {
        if(newArry.length == 0) return;
        for(int i=0; i< newArry.length; i++){
            newArry[i] = Math.pow(newArry[i], 2);
           // Arrays.sort(newArry);
        }

        System.out.println(Arrays.toString(newArry));
    }
}
