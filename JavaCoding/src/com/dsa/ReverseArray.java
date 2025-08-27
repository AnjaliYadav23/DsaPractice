package com.dsa;

import java.util.Scanner;

public class ReverseArray {
    public static  void  main(String [] args){
        Scanner sc= new Scanner(System.in);
        int num= sc.nextInt();
        int[] arr= new int[num];
        System.out.println("Enter " + num + " elements:");
        for(int i=0;i<num;i++){
            arr[i]=sc.nextInt();
        }
        System.out.println("Original Array:");
       for(int n:arr){
           System.out.print(n + " ");
       }
       int start=0,end=num-1;
       while (start<end){
           int temp=arr[start];
          arr [start]=arr[end];
           arr[end]=temp;
           start++;
           end--;
       }
        System.out.println("\nReversed Array:");
for(int n:arr){
    System.out.print(n + " ");

}
    }
}
