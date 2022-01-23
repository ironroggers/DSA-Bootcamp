package com.company;

public class GCD_LCM {
    public static void main(String[] args) {
        int num=gcd(100,200);
        System.out.println(num);
        System.out.println(lcm(3,7));
    }

    static int gcd(int a,int b){
        if(a==0){
            return b;
        }
        return gcd(b%a,a);
    }
    static int lcm(int a, int b){
        return(a*b)/gcd(a,b);
    }
}
