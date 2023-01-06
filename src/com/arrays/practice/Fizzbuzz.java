package com.arrays.practice;

import java.util.Collections;
import java.util.List;
import java.util.stream.IntStream;

public class Fizzbuzz {

    public static List<Object> fizzbuzz(int n){

       List<Object> result = Collections.singletonList(IntStream.rangeClosed(1, n)
               .mapToObj(i -> i % 5 == 0 ? (i % 7 == 0 ? "FizzBuzz" : "Fizz") : (i % 7 == 0 ? "Buzz" : i)).toList());
        /*ArrayList<String> result =new ArrayList<>();
        for(int i=1;i<=n;i++){
            if((i%15)==0){
                result.add("FizzBuzz");
            }
            else if(i%5 == 0){
                result.add("Buzz");
            }
            else if(i%3 == 0){
                result.add("Fizz");
            }
            else{
                result.add(i+"");
            }

        }*/

        return result;

    }

    public static void main(String[] args) {
      System.out.println(fizzbuzz(12));
    }
}