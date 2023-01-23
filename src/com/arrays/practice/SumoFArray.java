package com.arrays.practice;

public class SumoFArray {
  public static void main(String[] args) {
      int[] inputArray = {10,55,78,90,12,45,-90,23,12};
      int sum =sumoFArray(inputArray);
      System.out.println("The total sum is " + sum);
    }

    private static int sumoFArray(int[] inputArray) {
      if(inputArray.length == 0){return 0;}
      int sum=0;
      for(int number: inputArray){
          sum +=number;
      }
      int averge = sum/inputArray.length;
      return averge;
    }
}
