package com.company;

public class FindSmallestLetterGreaterThanTarget {

    static char ceiling(String s,String t){
        char target=t.charAt(0);
        char []ch=s.toCharArray();
        int start=0;
        int end=ch.length-1;
        if(target>end){

        }
        while(start<=end){
            int mid=(start+(end-start)/2);
            if(ch[mid]>target){
                end=mid-1;
            }
            else{
                start=mid+1;
            }
        }
        return ch[start%s.length()];
    }

    public static void main(String[] args) {
        String s="cfj";
        char ans=ceiling(s,"c");
        System.out.println(ans);

    }
}
