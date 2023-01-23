package com.arrays.practice;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class ConvertArrayToArrayList {
    public static void main(String[] args) {
        int[] inputArray = {10,55,78,90,12,45,90,23,12};
        List<int[]> list= ConvertArrayToArrayListMethod(inputArray);
        System.out.println(list);
    }

    private static List<int[]> ConvertArrayToArrayListMethod(int[] inputArray) {
        if(inputArray.length == 0) return  new ArrayList();
        return Arrays.asList(inputArray);
    }
}
