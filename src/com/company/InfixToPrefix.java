import java.util.Stack;

public class InfixToPrefix {
    public static void main(String[] args) {
        String infix = "2+3/9*7-4";
        Stack<Character> operator = new Stack<>();
        Stack<String> operand = new Stack<>();
        for(int i=0;i<infix.length();i++){
            char ch = infix.charAt(i);
            if(ch=='('){
                operator.push(ch);
            }else if(ch==')'){
                while(operator.peek()!='('){
                    String v2= operand.pop();
                    String v1= operand.pop();
                    char op = operator.pop();
                    operand.push(op+v1+v2);
                }
                operator.pop();
            }else if(ch=='+' || ch=='-' || ch=='*' || ch=='/'){
                while(!operator.isEmpty() && operator.peek()!='(' && operator.peek()!=')' && precedence(ch)<=precedence(operator.peek())){
                    String v2= operand.pop();
                    String v1= operand.pop();
                    char op = operator.pop();
                    operand.push(op+v1+v2);
                }
                operator.push(ch);
            }else if(Character.isDigit(ch)){
                operand.push(ch+"");
            }

        }
        while (!operator.isEmpty()){
            String v2= operand.pop();
            String v1= operand.pop();
            char op = operator.pop();
            operand.push(op+v1+v2);
        }
        System.out.println(operand.peek());

    }
    public static int precedence(char ch){
        if(ch=='+' || ch=='-'){
            return 1;
        }else if(ch=='*' || ch=='/'){
            return 2;
        }
        return 0;
    }
}
