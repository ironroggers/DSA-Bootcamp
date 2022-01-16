package com.company;

import com.sun.jdi.connect.Connector;

public class BinarySearch {
    static int binary(int [] arr,int target,int start,int end){

        while(start<=end){
            int mid = (start+end)/2;
            if(arr[mid]==target){
                return mid;
            }
            else if(arr[mid]>target){
                end=mid-1;
            }
            else if(arr[mid]<target){
                start=mid+1;
            }
        }
        return -1;
    }

    public static void main(String[] args) {
        int []arr={1,2,3,4,5,6,7,8,9,10,11,12,13,14};
        int index=binary(arr,4,0,arr.length-1);
        System.out.println(index);
    }

}
