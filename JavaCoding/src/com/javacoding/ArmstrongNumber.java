package com.javacoding;

public class ArmstrongNumber {
    public static void main(String[] args) {
        int num=152;
        int newNum=num;
        int count=0;
        while(num>0){
            num=num/10;
            count++;
        }
        num=newNum;
        double sum=0;
        while(num>0){
            int rem=num%10;
            sum=sum+ Math.pow(rem,count);
            num=num/10;
        }
        if (sum == newNum) {
            System.out.println(newNum + " is an Armstrong number");
        } else {
            System.out.println(newNum + " is NOT an Armstrong number");
        }
    }
}
