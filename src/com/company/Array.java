package com.company;

public class Array {
    public static void main(String[] args) {
        int [] arr=m1();
//        for(int i=0;i< arr.length;i++){
//            System.out.print(arr[i]+" ");
//        }
        int n=5;
        int [][] intArray = new int [n][];
        intArray[0]=new int[]{1,2,3,4,5};
        intArray[1]=new int[]{1,2,3,4};
        intArray[2]=new int[]{1,2,3};
        intArray[3]=new int[]{1,2};
        intArray[4]=new int[]{1};
        for(int i=0;i<n;i++){
            for(int j=0;j<intArray[i].length;j++){
                System.out.print(intArray[i][j]+" ");
            }
            System.out.println();
        }

    }
    public static int[] m1(){
        return new int[]{1,2,3,4};
    }
}
