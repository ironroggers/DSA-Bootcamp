package com.company;

public class FindDuplicateNumber {
    public static void main(String[] args) {
        int [] arr={5,4,6,3,2,8,1,2,0};
        cyclicSort(arr);
        for(int j=0;j<arr.length;j++){
            if(arr[j]!=j+1){
                System.out.println(arr[j]);
            }
        }

    }

    static void swapIndex(int [] arr, int i, int j){
        int temp=arr[i];
        arr[i]=arr[j];
        arr[j]=temp;
    }

    static void cyclicSort(int [] arr){
        int i=0;
        while(i<arr.length){
            if(arr[i]!=i-1 && arr[arr[i]]!=arr[i]){
                swapIndex(arr,i,arr[i]-1);
            }else {
                i++;
            }
        }

    }
}
