import java.util.Arrays;
import java.util.Stack;

public class StockSpan {
    public static void main(String[] args) {
        int [] arr = new int[]{3,6,9,4,2,15,8,7,10,6,1};
        Stack<Integer> st = new Stack<>();
        int [] span = new int[arr.length];
        st.push(0);span[0]=1;
        for(int i=1;i<arr.length;i++){
            while(!st.isEmpty() && arr[i]>arr[st.peek()]){
                st.pop();
            }
            if(st.isEmpty()){
                span[i]=i+1;
            }else {
                span[i]=i-st.peek();
            }
            st.push(i);
        }
        System.out.println(Arrays.toString(span));
    }
}
