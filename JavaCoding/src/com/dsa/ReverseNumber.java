package com.dsa;
import java.util.*;
public class ReverseNumber {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter number");

        int num = sc.nextInt();
        int rev=0;
        while (num > 0) {
            int rem ;
            rem=num%10;
            num /= 10;
           rev=(rev*10)+rem;
        }
        System.out.println(rev);
    }
}
