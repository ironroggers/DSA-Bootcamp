package com.company;

public class PosInInfArray {
    public static void main(String[] args) {
        int []arr={3,5,7,9,10,90,100,130,140,160,170};
        int target=10;
        System.out.println(ans(arr,target));

    }

    static int ans(int [] arr, int target){
        int start=0;
        int end=1;
        while(target>arr[end]){
            int temp=end+1;
            end = end + (end-start+1)*2;
            start=temp;
        }
        return binarySearch(arr,start,end,target);
    }

    static int binarySearch(int []arr,int start, int end,int target){
        while(start<=end){
            int mid= start + (end-start)/2;
            if(arr[mid]<target){
                start=mid+1;
            }
            else if(arr[mid]>target){
                end=mid-1;
            }
            else {
                return mid;
            }

        }
        return -1;
    }
}
