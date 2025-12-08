package com.javacoding;

public class CheckStringPalindrome {
    public static void main(String[] args){
        String str="Madam";
        str=str.toLowerCase();
        StringBuilder ab=new StringBuilder();
        for(int i=str.length()-1;i>=0;i--){
           ab.append(str.charAt(i));
        }
        String reversed = ab.toString();
        System.out.println(reversed);
        if(reversed.equals(str)){
            System.out.println("Palindrome") ;
        }
        else{
            System.out.println("NotPalindrome") ;

        }
    }
}
