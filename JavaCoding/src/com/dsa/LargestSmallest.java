package com.dsa;
public class LargestSmallest {
    public static void main(String[] args) {
        int[] arr = {8, 7, 4, 8, 4, 9};
        int largest = arr[0];
        int smallest = arr[0];
        for (int i = 1; i < arr.length; i++) {
            if (largest < arr[i]) {
                largest = arr[i];
            }
                if (smallest > arr[i]) {
                    smallest = arr[i];
                }
            }

        System.out.println("Largest number: " + largest);
        System.out.println("Smallest number: " + smallest);
    }
}