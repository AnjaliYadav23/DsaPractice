package com.javacoding;

public class ArraySum {
    public static void main(String[] args) {
        int [] arr={8,9,7,6,5,3,2};
        int sum=0;
        for(int num : arr){
            sum+=num;
        }
        System.out.println("Sum of all elements: " + sum);

    }
    }
