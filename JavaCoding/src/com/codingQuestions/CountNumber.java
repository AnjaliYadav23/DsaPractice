package com.codingQuestions;

public class CountNumber {
    public static  void main(String []args){
        int num=345;
        int count=0;
        while(num>0){
            int rem=num%10;
           count++;
            num=num/10;
        }
        System.out.println(count);
    }
}
