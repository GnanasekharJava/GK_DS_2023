package com.arrays.practice;

import java.util.Arrays;

public class AVergeOfArray {
    public static void main(String[] args) {
        int[] inputArray = {10,55,78,90,12,45,-90,23,12};
        int arr1[] = {10,20,30,40,50};
        int arr2[] = arr1;
        int arr3[] = {10,20,30,40,50};
        int arr4[] = {15,25,35,45,55};

        compareArrays(arr1,arr2,arr3,arr4 );

    }

    private static void compareArrays(int[] arr1, int[] arr2, int[] arr3, int[] arr4) {
        if(arr1 == arr2){
          //  System.out.println("arr1 and arr2 are same");
        }

        if(arr3 == arr1){
          //  System.out.println("arr2 and arr1 are same");
        }

        if(arr1.equals(arr2)){
         //   System.out.println("arr2 and arr1 are equal");
        }

        if(arr1.equals(arr4)){
            System.out.println("arr2 and arr4 are equal");
        }

        System.out.println("Equals are"+ Arrays.equals(arr2,arr1));
        //System.out.println(Arrays.compare(arr1,arr2));
    }
}
