// { Driver Code Starts
//Initial Template for Java

import java.util.ArrayList;
import java.util.Collections;
import java.util.Scanner;

class GFG
{
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int t = sc.nextInt();
        while(t-- > 0)
        {
            int N=sc.nextInt();
            ArrayList<Integer> arr = new ArrayList<>();
            for(int i = 0; i < N ; i++){
                arr.add(sc.nextInt());
            }
            Solution ob = new Solution();

            ArrayList<Integer> ans = ob.subsetSums(arr,N);
            Collections.sort(ans);
            for(int sum : ans){
                System.out.print(sum+" ");
            }
            System.out.println();
        }
    }
}
// } Driver Code Ends


//User function Template for Java//User function Template for Java
class Solution{
    ArrayList<Integer> subsetSums(ArrayList<Integer> arr, int N){
        // code here
        ArrayList<Integer> sum = new ArrayList<>();
        solve(arr,N,0,sum);
        return new ArrayList<>(sum);

    }
    void solve(ArrayList<Integer> arr, int N, int pos,ArrayList<Integer> sum){
        if(pos>=arr.size()){

            return;
        }
        solve(arr,N,pos+1,sum);
        sum.add(arr.get(pos));
        solve(arr,N-arr.get(pos),pos+1,sum);
//        sum.remove(sum.size()-1);
    }
}