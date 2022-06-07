import java.util.Arrays;
import java.util.Scanner;
import java.util.Stack;

public class NextGreaterElementToRight {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        int [] arr = new int[]{2,5,9,3,1,12,6,8,7};
        Stack<Integer> st = new Stack<>();
        int [] nge = new int[arr.length];
        for(int i=nge.length-1;i>=0;i--){
            if(i==nge.length-1){
                nge[i]=-1;
                st.push(arr[i]);
            }else {
                while (!st.isEmpty() && arr[i]>st.peek()){
                    st.pop();
                }
                if(st.isEmpty()){
                    nge[i]=-1;
                }else {
                    nge[i]=st.peek();
                }
                st.push(arr[i]);
            }
        }
        System.out.println(Arrays.toString(nge));
    }
}
