import java.lang.reflect.Array;
import java.util.Arrays;
import java.util.Stack;

public class CelebrityProblem {
    public static void main(String[] args) {
        int [][] arr = new int[][]{{0,1,1,1},{1,0,1,0},{0,0,0,0},{1,1,1,0}};
        Stack<Integer> st = new Stack<>();
        for(int i=0;i<arr.length;i++) {
            st.push(i);
        }
        while(st.size()!=1){
            int v1 = st.pop();
            int v2 = st.pop();
            if(arr[v1][v2] == 1){
                st.push(v2);
            }else {
                st.push(v1);
            }
        }
        int x = st.peek();
        for(int i=0;i<arr.length;i++){
            if(i==x){
                continue;
            }
            if(arr[i][x]!=1){
                System.out.println("none");
                return;
            }
        }
        for(int i=0;i<arr[0].length;i++){
            if(arr[x][i]!=0){
                System.out.println("none");
                return;
            }
        }
        System.out.println(x);
    }
}
