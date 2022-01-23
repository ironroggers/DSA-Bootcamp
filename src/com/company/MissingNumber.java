package com.company;

import java.util.Arrays;

public class MissingNumber {
    public static void main(String[] args) {
        int [] arr={5,4,6,3,2,8,1,9,0};
        sort(arr);
        for(int i=0;i<arr.length;i++){
            if(arr[i]!=i){
                System.out.println(i);
            }
        }
    }

    static void sort(int []arr){
        int i=0;
        while (i<arr.length){
            if(arr[i]<arr.length && arr[i]!=i){
                swap(arr,arr[i],arr[arr[i]]);
            }else{
                i++;
            }
        }
    }

    static void swap(int[] arr,int i,int j){
        int temp=arr[i];
        arr[i]=arr[j];
        arr[j]=temp;
    }

}
