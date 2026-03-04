package com.codingQuestions;
import java.util.Arrays;

public class SortArray {

    // Method to sort array
    public static void sortArray(int[] arr) {
        Arrays.sort(arr);   // Inbuilt method
    }

    public static void main(String[] args) {
        int[] numbers = {5, 2, 8, 1, 3};

        sortArray(numbers);

        System.out.println("Sorted Array: ");
        for(int num : numbers) {
            System.out.print(num + " ");
        }
    }
}



