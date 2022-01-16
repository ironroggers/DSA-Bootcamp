package com.company;

import java.util.Arrays;

public class SelectionSort {

    static int max(int [] arr, int end){
        int ans=Integer.MIN_VALUE;
        for(int i=0;i<=end;i++){
            if(arr[i]>ans){
                ans=arr[i];
            }
        }
        return ans;
    }

    static void sort(int [] arr){
        int end=arr.length-1;
        for(int i=0;i< arr.length;i++){
            for(int j=0;j<=end;j++){
                int max=max(arr,end);
                System.out.println("Max = "+max);
                if(arr[j]==max){
                    int temp=arr[end];
                    arr[end]=arr[j];
                    arr[j]=temp;
                    end=end-1;
                }
            }

        }
    }

    public static void main(String[] args) {
        int [] arr={4,-5,1,0,3};
        sort(arr);
        System.out.println(Arrays.toString(arr));
    }
}
