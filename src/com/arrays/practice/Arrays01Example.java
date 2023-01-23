package com.arrays.practice;

import java.util.Arrays;

public class Arrays01Example {


    public static void main(String[] args) {
        int[] createArray = new int[10];
        printArray(createArray);
    }

    private static void printArray(int[] createArray) {
        if (createArray.length == 0) {
            return;
        }
        createArray[0] = 10;
        createArray[1] = 20;
        createArray[2] = 30;
        createArray[3] = 40;
        createArray[4] = 50;
        createArray[5] = 60;
        createArray[6] = 70;
        createArray[7] = 80;
        createArray[8] = -90;
        createArray[9] = -100;

        for (int i = 0; i < createArray.length; i++) {

            if (createArray[i] == 70) {
                System.out.println("the index is" + " " + i);
                break;
            }
        }

        System.out.println(Arrays.toString(createArray));
    }


}
