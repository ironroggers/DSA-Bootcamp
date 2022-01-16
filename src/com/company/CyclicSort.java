package com.company;

import java.util.Arrays;

public class CyclicSort {

    static void sort(int [] arr){
        for(int i=0;i<arr.length;i++){
            if(arr[i]!=i+1){
                int temp=arr[i];
                arr[i]=i+1;
                arr[temp-1]=temp;
            }
        }
    }

    public static void main(String[] args) {
        int [] arr={5,4,6,3,7,2,8,1,9};
        sort(arr);
        System.out.println(Arrays.toString(arr));
    }
}
