package com.company;

import java.util.Arrays;

public class BubbleSort {
    public static void main(String[] args) {
        int [] arr={-5,-6,-3,-7,-1,-8,-9};
        sort(arr);
        System.out.println(Arrays.toString(arr));

    }

    static void sort(int[]arr){
        for(int i=0;i< arr.length;i++){
            boolean flag=false;
            for(int j=1;j< arr.length-i;j++){
                if(arr[j]<arr[j-1]){
                    int temp=arr[j];
                    arr[j]=arr[j-1];
                    arr[j-1]=temp;
                    flag=true;
                }
            }
            if(!flag){
                break;
            }
        }
//        System.out.println(Arrays.toString(arr));
    }

}
