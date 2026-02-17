package com.codingQuestions;

public class PrimeNumber {
    public static void main(String[] args) {
        int num=5;
        boolean isPrime=true;
        if(num<=1){
            isPrime=false;
        }
        else{
            for(int i=2;i<num;i++){
                if(num%i==0){
                    isPrime=false;
                    break;
                }
            }
        }
        if(isPrime){
            System.out.println(num + " is Prime");
        } else {
            System.out.println(num + " is Not Prime");
        }
        }


    }
