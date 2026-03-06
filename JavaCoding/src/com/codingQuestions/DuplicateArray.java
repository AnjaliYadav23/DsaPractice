package com.codingQuestions;

public class DuplicateArray {
    public  static void main(String[] args){
        int arr[]={ 2,7,8,9,1,4,3,6,9};
        for(int i=0;i<arr.length;i++){
            for(int j=i+1;j<arr.length;j++){
                 if(arr[i]==arr[j]){
                   System.out.println(arr[j]);
                 }
            }
        }
    }

}
