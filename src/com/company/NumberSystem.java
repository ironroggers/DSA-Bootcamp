package com.company;

public class NumberSystem {

    static boolean isOdd(int n){
        return (n&1)==1;
    }

    public static void main(String[] args) {
        System.out.println(isOdd(7));
        int a =7;
        System.out.println((byte)~a);
    }

}
