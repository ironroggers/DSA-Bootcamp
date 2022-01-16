package com.company;

import java.util.Scanner;

public class SoD {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        int T=in.nextInt();

        while(T-->0){
            int sum=0;
            int N=in.nextInt();

            while(N>9){
                sum+=N%10;
                N=N/10;
            }
            sum+=N;
            System.out.println(sum);

        }

    }
}
