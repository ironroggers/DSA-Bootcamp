import java.util.Arrays;
import java.util.Stack;

public class SlidingWindowMaximum {
    public static void main(String[] args) {
        int [] arr = new int[]{2,9,3,8,1,7,12,6,14,4,32,0,7,19,8,12,6};
        int k = 4;
        int [] nge = nextGreaterElement(arr);
        int [] res = new int[nge.length-k+1];
        for(int i=0;i<res.length;i++){
            int j=i;

            while(j<i+k){
                if(nge[j] > i+k-1){
                    res[i]=arr[j];
                    break;
                }
                else if(nge[j]<0){
                    res[i]=arr[j];
                    break;
                }else{
                    j=nge[j];
                }
            }
        }
        System.out.println(Arrays.toString(res));

    }

    private static int[] nextGreaterElement(int[] arr) {
        Stack<Integer> st = new Stack<>();
        int [] nge = new int[arr.length];
        nge[arr.length-1]=-1;
        st.push(arr.length-1);
        for(int i=arr.length-2;i>=0;i--){
            while(!st.isEmpty() && arr[st.peek()]<=arr[i]){
                st.pop();
            }
            if(st.isEmpty()){
                nge[i]=-1;
            }else {
                nge[i]=st.peek();
            }
            st.push(i);
        }
        return nge;
    }
}
