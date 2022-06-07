import java.util.Scanner;
import java.util.Stack;

public class BalancedBrackets {
    public static void main(String[] args) {
        Scanner in  = new Scanner(System.in);
        String str = "()(){([][][[][][]](a+b)})";
        Stack<Character> st = new Stack<>();
        for(int i = 0;i<str.length();i++){
            if(str.charAt(i)=='(' ||  str.charAt(i)== '{' || str.charAt(i)== '['){
                st.push(str.charAt(i));
            }else if(str.charAt(i)==')') {
                if (!st.isEmpty() && st.peek() == '(') {
                    st.pop();
                } else {
                    System.out.println("Unbalanced");
                    return;
                }
            }else if(str.charAt(i)=='}'){
                if(!st.isEmpty() && st.peek()=='{'){
                    st.pop();
                }else {
                    System.out.println("Unbalanced");
                    return;
                }
            }else if(str.charAt(i)==']'){
                if(!st.isEmpty() && st.peek()=='['){
                    st.pop();
                }else {
                    System.out.println("Unbalanced");
                    return;
                }
            }

        }
        if(st.isEmpty()){
            System.out.println("Balanced");
        }else {
            System.out.println("Unbalanced");
        }


    }
}
