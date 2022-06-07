import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class TargetSumSubset {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        int n = in.nextInt();
        int []arr = new int[n];
        for(int i=0;i<n;i++){
            arr[i]=in.nextInt();
        }
        int target = in.nextInt();
        getTargetSumSubset(arr,0,"",0,target);
    }

    private static void getTargetSumSubset(int[] arr, int idx, String set, int sos, int target){
        if(target==0){
            System.out.println(set+".");
            return;
        }
        if(target<0 || idx>arr.length-1){
            return;
        }
        getTargetSumSubset(arr,idx+1, set+arr[idx]+",",sos+arr[idx],target-arr[idx]);
        getTargetSumSubset(arr,idx+1, set,sos,target);

    }
}
