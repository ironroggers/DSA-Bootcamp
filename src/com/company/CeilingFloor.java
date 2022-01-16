package com.company;

public class CeilingFloor {

    static int ceiling(int []arr, int target){
        int start=0;
        int end= arr.length-1;
        while(start<=end){
            int mid=(start+end)/2;
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
        return start;

    }
    static int floor(int [] arr,int target){
        int start=0;
        int end= arr.length-1;
        while(start<=end){
            int mid=(start+end)/2;
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
        return end;

    }
    public static void main(String[] args) {
        int [] arr={-10,-4,0,2,3,5,7,9,11,15,17,21};
        int ceil=ceiling(arr,8);
        int flor=floor(arr,8);
        System.out.println("Ceil: - "+arr[ceil]);
        System.out.println("Floor: - "+arr[flor]);

    }
}
