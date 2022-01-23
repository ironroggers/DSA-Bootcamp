package com.company;

import java.util.Arrays;

public class Strings {


    public static void main(String[] args) {
        String a= "Kunal";
        String b= "Kunal";
        b="Kushwaha";
        System.out.println(a+b);
        System.out.println("Pattern 1");
        pattern1(5);
        System.out.println("Pattern 2");
        pattern2(5);
        System.out.println("Pattern 3");
        pattern3(5);
        System.out.println("Pattern 4");
        pattern4(5);
        System.out.println("Pattern 5");
        pattern5(5);
    }
    static void pattern1(int n){
        for(int i=1;i<=n;i++){
            for(int j=1;j<=i;j++){
                System.out.print("* ");
            }
            System.out.println();
        }
    }
    static void pattern2(int n){
        for(int i=1;i<=n;i++){
            for(int j=1;j<=n;j++){
                System.out.print("* ");
            }
            System.out.println();
        }
    }
    static void pattern3(int n){
        for(int i=1;i<=n;i++){
            for(int j=n;j>=i;j--){
                System.out.print("* ");
            }
            System.out.println();
        }
    }
    static void pattern4(int n){
        for(int i=1;i<=n;i++){
            for(int j=1;j<=i;j++){
                System.out.print(j+" ");
            }
            System.out.println();
        }
    }

    static void pattern5(int n){
        for(int i=1;i<2*n;i++){

            int totCols= i > n ? 2*n-i : i;
            int noOfSpaces=n-totCols;
            for(int k=noOfSpaces;k>0;k--){
                System.out.print(" ");
            }
            for(int j=0;j<totCols;j++){
                System.out.print("* ");
            }
            System.out.println();
        }

    }

}
