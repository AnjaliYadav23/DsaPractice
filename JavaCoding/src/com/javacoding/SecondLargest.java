package com.javacoding;

public class SecondLargest {
    public static void main (String[] args) {

        int[] arr = {2, 7, 5, 8, 9, 9};
        int Largest=Integer.MIN_VALUE;
        int SecondLargest=Integer.MIN_VALUE;
        for(int num: arr){
            if(num>Largest){
                SecondLargest=Largest;
                Largest=num;
            }
            else if(num>SecondLargest && num!=Largest){
                SecondLargest=num;
            }
        }
        System.out.println("Second largest number is: " + SecondLargest);


    }
}
