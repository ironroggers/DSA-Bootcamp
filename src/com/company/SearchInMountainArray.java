package com.company;

public class SearchInMountainArray {

    public static void main(String[] args) {
        int []arr={1,2,4,5,6,7,5,3,1};
        int peak=findPeak(arr);
        int a=binarySearch(arr,3,0,peak);
        if(a<0){
            a=binarySearch(arr,3,peak, arr.length);
        }
        System.out.println(a);

    }

    static int binarySearch(int [] arr,int target,int start,int end){
        while (start<=end){
            int mid=(start+end)/2;
            if(arr[mid]>target){
                end=mid-1;
            }
            else if(arr[mid] <target){
                start=mid+1;
            }
            else if(arr[mid]==target){
                return mid;
            }
        }
        return -1;
    }

    static int findPeak(int [] arr){
        int start=0;
        int end= arr.length-1;
        while(start!=end){
            int mid=(start+end)/2;
            if(arr[mid]>arr[mid+1]){
                end=mid;
            }
            else if(arr[mid]<arr[mid+1]){
                start=mid+1;
            }

        }
        return start;
    }
}
