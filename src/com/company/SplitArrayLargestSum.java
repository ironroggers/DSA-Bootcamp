package com.company;

import java.util.Arrays;

public class SplitArrayLargestSum {
    public static void main(String[] args) {
        int [] arr={7,2,5,8,10};
        int m=2;
        int ans=partition(arr,m);
        System.out.println(ans);

    }

    static int partition(int []arr, int m){
        int start=largest(arr);
        int end= Arrays.stream(arr).sum();
        while(start<end){
            int mid=start+(end-start)/2;
            int sum=0;
            int pieces=1;
            for(int i : arr){
                if(sum+i>mid){
                    sum=i;
                    pieces++;
                }
                else{
                    sum+=i;
                }
            }
            if(pieces>m){
                start=mid+1;
            }
            else {
                end=mid;
            }


        }
        return end;

    }

    static int largest(int []arr){
        int max=Integer.MIN_VALUE;
        for (int i : arr){
            if(i>max){
                max=i;
            }
        }
        return max;
    }
}
