import java.util.Stack;

public class DuplicateBrackets {
    public static void main(String[] args) {
        String exp = "(a+b) + (a+b)";
        Stack<Character> st = new Stack<>();
        for(int i=0;i<exp.length();i++){
            if(exp.charAt(i)!=')'){
                st.push(exp.charAt(i));
            }else {
                if(st.peek()=='('){
                    System.out.println(true);
                    return;
                }else {
                    while (st.peek()!='('){
                        st.pop();
                    }
                    st.pop();
                }
            }
        }
        System.out.println(false);
    }
}
