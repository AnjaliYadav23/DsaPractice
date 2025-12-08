package com.javacoding;

public class ReverseString {
    public static void main (String args[]){
        String str= "Madam";
        str=str.toLowerCase();
        String Reversed=" ";
        for(int i=str.length()-1;i>=0;i--){
            Reversed=Reversed+str.charAt(i);
        }
        System.out.print(Reversed);
    }
}
