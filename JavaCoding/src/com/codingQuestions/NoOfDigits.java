package com.codingQuestions;

public class NoOfDigits {
    public static void main(String args[]) {
        int num=567;
        int sum=0;
        for(int i=num;i!=0;i=i/10){
            sum+=1;
        }
        System.out.println(sum);
    }
    }

