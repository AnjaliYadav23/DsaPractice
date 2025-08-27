package com.dsa;

import java.util.Scanner;

public class LargestOfThreeNumber {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int num= sc.nextInt();
        int num2= sc.nextInt();
        int num3= sc.nextInt();
      if(num>num2&&num>num3){
          System.out.print(num);
      }
      else if(num2>num&&num2>num3){
          System.out.print(num2);
      }
      else {
          System.out.print(num3);
      }


    }
}