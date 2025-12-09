package com.javacoding;

public class SmallestNumber {
    public static void main (String[] args){
        int [] arr={3,1,1,3,5};
        int smallestNo=arr[0];
        for(int i=0;i<=arr.length-1;i++){
            if(arr[i]<smallestNo){
                smallestNo=arr[i];
            }
        }
        System.out.print(smallestNo);

    }
}
