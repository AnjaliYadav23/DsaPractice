package com.javacoding;

public class FindMissingNo {
    public static void main(String []args){
        int[] arr={1,3,4,5,6};
        int n=6;
        int sumOfArray=n*(n+1)/2;
        int actualOfsum=0;
        int missingNumber;
        for(int i=0;i<=arr.length-1;i++){
            actualOfsum+=arr[i];

        }
        missingNumber=sumOfArray-actualOfsum;
        System.out.print(missingNumber);
    }

}
