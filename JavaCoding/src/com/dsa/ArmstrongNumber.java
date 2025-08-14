package com.dsa;
import  java.util.Scanner;
public class ArmstrongNumber {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int num = sc.nextInt();
        double arm = 0;
        int count = 0;
        int temp = num;

        while (temp > 0) {
            temp = temp / 10;
            count++;
        }
        temp = num;
        while (temp > 0) {
            int rem;
            rem = temp % 10;
            arm = arm + Math.pow(rem, count);
            temp /= 10;
        }
        System.out.println(arm);
        if (arm == num) {
            System.out.println("ArmstrongNumber");
        } else {
            System.out.println("Not ArmstrongNumber");
        }
    }
}