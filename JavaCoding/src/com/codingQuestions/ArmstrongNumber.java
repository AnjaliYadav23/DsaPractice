package com.codingQuestions;

public class ArmstrongNumber {
    public static void main(String args[]) {
        int num = 153;
        int original = num;
        int newnum=original;
        int arm= 0;
        int count=0;
        while (num>0){
            count++;
           num= num/10;

        }
        while (original> 0) {
            int rem = original% 10;
           arm=arm+(int)Math.pow(rem,count);
            original = original/ 10;
        }
        if (arm==newnum){
            System.out.println("ArmstrongNumber");
        }
        else{
            System.out.println("NotArmstrongNumber");
        }
    }
}