class CustomStack {
    int [] data;
    int tos;
    CustomStack(int cap){
        data= new int[cap];
        tos=-1;
    }
    public void push(int val){
        if(tos==data.length-1){
            System.out.println("Stack Overflow");
        }else {
            tos += 1;
            data[tos] = val;
        }
    }
    public int pop(){
        if(tos==-1){
            System.out.println("Underflow");
        }else{
            tos--;
            return data[tos+1];
        }
        return -1;
    }
    public int peek(){
        if(tos==-1){
            System.out.println("Underflow");
        }else{
            return data[tos+1];
        }
        return -1;
    }
    public void display(){
        for(int i=tos;i>=0;i--){
            System.out.print(data[i] + " ");
        }
        System.out.println();
    }
}
public class Stack {
    public static void main(String[] args) {
        CustomStack stack = new CustomStack(5);

        stack.push(54);
        stack.push(5);
        stack.push(4);
        stack.pop();
        stack.peek();
        stack.display();
    }
}
