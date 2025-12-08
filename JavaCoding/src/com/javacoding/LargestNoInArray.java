package com.javacoding;

public class LargestNoInArray {
    public static void main(String[] args) {

        int arr[] = {3, 81, 8, 5};
        int largest=arr[0];
        for (int i = 0; i <= arr.length - 1; i++) {
            if(arr[i]>largest){
                largest=arr[i];
            }
        }
        System.out.println("Largest Number: " + largest);

    }
}