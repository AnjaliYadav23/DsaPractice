package com.javacoding;

public class CountEvenOdd {
    public static void main(String []args){
        int [] arr={2,6,3,8,9,7,9};
        int evenCount=0;
        int oddCount=0;
        for(int i=0;i<=arr.length-1;i++){
            if(arr[i]%2==0){
                evenCount++;
            }
            else {
                oddCount++;
            }
        }

        System.out.println("Even numbers: " + evenCount);
        System.out.println("Odd numbers: " + oddCount);
    }

}
