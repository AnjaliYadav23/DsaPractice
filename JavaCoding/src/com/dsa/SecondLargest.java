package com.dsa;

public class SecondLargest {

        public static void main(String[] args) {
            int[] arr = {10, 20, 4, 45, 99};

            // Initialize
            int largest = Integer.MIN_VALUE;
            int secondLargest = Integer.MIN_VALUE;

            for (int num : arr) {
                if (num > largest) {
                    // update both
                    secondLargest = largest;
                    largest = num;
                } else if (num > secondLargest && num != largest) {
                    // update second largest
                    secondLargest = num;
                }
            }

            if (secondLargest == Integer.MIN_VALUE) {
                System.out.println("No second largest element");
            } else {
                System.out.println("Largest: " + largest);
                System.out.println("Second Largest: " + secondLargest);
            }
        }
    }


