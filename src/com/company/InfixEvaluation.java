import java.util.Stack;
// Valid only for single digit numbers
public class InfixEvaluation {
    public static void main(String[] args) {
        String str = " 2-1 + 2 ";
        Stack<Integer> operand = new Stack<>();
        Stack<Character> operator = new Stack<>();
        for(int i=0;i<str.length();i++){
            char ch = str.charAt(i);

            if(Character.isDigit(ch)){
                operand.push(ch-'0');
            }else if(ch == '('){
                operator.push(ch);
            }else if(ch == ')'){
                while(operator.peek()!='('){
                    int v2 = operand.pop();
                    int v1 = operand.pop();
                    char op = operator.pop();
                    operand.push(operation(v1,v2,op));
                }
                operator.pop();
            }else if(ch == '+' || ch=='-' || ch=='*' || ch=='/'){
                while(operator.size()>0 && operator.peek()!='(' && operator.peek()!=')' && precedence(ch)<operator.peek()){
                    int v2 = operand.pop();
                    int v1 = operand.pop();
                    char op = operator.pop();
                    operand.push(operation(v1,v2,op));
                }
                operator.push(ch);
            }
        }
        while(!operator.isEmpty()){
            int v2 = operand.pop();
            int v1 = operand.pop();
            char op = operator.pop();
            operand.push(operation(v1,v2,op));
        }
        System.out.println(operand.pop());
    }
    public static int precedence(char ch){
        if(ch=='+' || ch=='-'){
            return 1;
        }else if(ch=='*' || ch=='/'){
            return 2;
        }
        return 0;
    }
    public static int operation(int v1, int v2, char ch){
        if(ch=='+'){
            return v1+v2;
        }else if(ch == '-'){
            return v1-v2;
        }else if(ch=='*'){
            return v1*v2;
        }else if(ch == '/'){
            return v1/v2;
        }
        return 0;
    }
}
