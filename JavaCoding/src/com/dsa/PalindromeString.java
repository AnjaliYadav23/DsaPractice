package com.dsa;

import java.util.Scanner;

public class PalindromeString {
    public static void main(String[] args){
        Scanner sc= new Scanner(System.in);
        System.out.println("Enter String"+" ");
        String str =sc.nextLine();

        StringBuilder rev = new StringBuilder();
        for(int i=str.length()-1;i>=0;i--) {
           rev.append (str.charAt(i) );
        }

       if(str.equals(rev.toString())){
           System.out.println("PalindromeString");
       }
       else{
           System.out.println(" Not PalindromeString");
       }
    }
}
