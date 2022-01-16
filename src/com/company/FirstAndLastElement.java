package com.company;

import java.util.Arrays;

public class FirstAndLastElement {

    static int[] findPos(int [] arr,int target){
        int [] ans={-1,-1};
        int start=search(arr,target,true);
        int end=search(arr,target,false);
        ans[0]=start;
        ans[1]=end;
        return ans;
    }

    static int search(int []arr,int target,boolean findFirstIndex){
        int start=0;
        int ans=-1;
        int end=arr.length-1;
        while(start<=end){
            int mid=(start+end)/2;
            if(arr[mid]>target){
                end=mid-1;
            }
            else if(arr[mid]<target){
                start=mid+1;
            }
            else{
                ans=mid;
                if(findFirstIndex){
                    end=mid-1;
                }
                else{
                    start=mid+1;
                }
            }
        }
        return ans;
    }

    public static void main(String[] args) {
        int []arr={4,7,7,7,7,8,8,10};
        int []ans=findPos(arr,7);
        System.out.println(Arrays.toString(ans));

    }
}
