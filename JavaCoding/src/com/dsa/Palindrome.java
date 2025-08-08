package com.dsa;

import java.util.Scanner;

public class Palindrome {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter number");

        int num = sc.nextInt();
        int rev=0;
        int newnum=num;
        while (num > 0) {
            int rem ;
            rem=num%10;
            num /= 10;
            rev=(rev*10)+rem;
        }
        if(newnum==rev){
            System.out.println("Palindrome Number");
        }
        else {
            System.out.println(" Not Palindrome Number");
        }
    }
}
