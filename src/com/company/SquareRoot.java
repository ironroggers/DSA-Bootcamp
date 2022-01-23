package com.company;

public class SquareRoot {
    public static void main(String[] args) {
        int num=40;
        int p=3;
        System.out.printf("%.3f",sqrt(num,p));

    }

    static double sqrt( int num, int p){
        int s=0;
        int e=num;
        double root=0.0;
        while(s<=e){
            int m= s+(e-s)/2;
            if(m*m == num){
                return m;
            }else if(m*m < num){
                s=m+1;
            }else{
                e=m-1;
            }
        }
        double incr=0.1;
        for(int i=0;i<p;i++){
            while(root*root<=num){
                root+=incr;
            }
            root-=incr;
            incr/=10;
        }
        return root;


    }
}
