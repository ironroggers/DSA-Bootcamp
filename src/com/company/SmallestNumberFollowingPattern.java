import java.util.ArrayDeque;
import java.util.Queue;
import java.util.Stack;

public class SmallestNumberFollowingPattern {
    public static void main(String[] args) {
        Queue<Integer> que = new ArrayDeque<>();
        que.poll();
        String str = "ddidddid";
        Stack<Integer> st = new Stack<>();
        int x=1;
        String res = "";
        for(int i=0;i<str.length();i++){
            if(str.charAt(i)=='d'){
                st.push(x);
                x++;
            } else if (str.charAt(i)=='i') {
                st.push(x);x++;
                while(!st.isEmpty()){
                    res+=st.pop();
                }
            }
        }
        st.push(x);
        while(!st.isEmpty()){
            res+=st.pop();
        }

        System.out.println(res);
    }
}
