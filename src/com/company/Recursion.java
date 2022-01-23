package com.company;

public class Recursion {

    static int search(int [] arr, int target,int s,int e){
        if(s>e){
            return -1;
        }
        int m=s+(e-s)/2;
        if(arr[m]==target){
            return m;
        }
        if(arr[m]>target){
            return search(arr,target,s,m-1);
        }
        return search(arr,target,m+1,e);
    }

    public static void main(String[] args) {
        int []arr={1,2,3,4,5,6,7,8,9,34,56,78,90};
        int index=search(arr,78,0,arr.length-1);
        System.out.println(index);
    }
}
