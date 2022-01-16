package com.company;

public class SearchInRotatedSortedArray {

    static int binarySearch(int [] arr,int target,int start,int end){
        while(start<end){
            int mid=(start+end)/2;
            if(arr[mid]>target){
                end=mid-1;
            }
            else if(arr[mid]<target){
                start=mid+1;
            }
            else if(arr[mid]==target){
                return mid;
            }
        }
        return -1;
    }

    static int findPivot(int [] arr){
        int start=0;
        int end=arr.length-1;
        while(start<=end){
            int mid=(start+end)/2;

            if(mid < end && arr[mid]>=arr[mid+1]){
                return mid;
            }
            else if(mid>start && arr[mid]<arr[mid-1]){
                return mid-1;
            }
            else if(arr[start]<=arr[mid]){
                start=mid+1;
            }
            else if(arr[start]>arr[mid]){
                end=mid-1;
            }
        }
        return -1;
    }

    public static void main(String[] args) {
        int []arr={4,5,6,7,0,1,2,3};
        int pivot=findPivot(arr);
        int target=0;
        if(arr[pivot]==target){
            System.out.println(pivot);
            return;
        }
        int ans=binarySearch(arr,target,0, pivot-1);
        if(ans==-1){
            ans=binarySearch(arr,target,pivot+1, arr.length-1);
        }
        System.out.println(ans);


    }
}
