public class ImplementTwoStackInOneArray {
    public static void main(String[] args) {
        TwoStack twoStack = new TwoStack(5);
        twoStack.push1(10);
    }
}
class TwoStack{
    int [] data;
    int tos1;
    int tos2;
    TwoStack(int cap){
        data= new int[cap];
        tos1=-1;
        tos2=data.length;
    }
    public void push1(int num){
        if(tos2 == tos1+1){
            System.out.println("Overflow");
        }else{
            tos1++;
            data[tos1]=num;
        }
    }
    public void push2(int num){
        if(tos2 == tos1+1){
            System.out.println("Overflow");
        }else{
            tos2--;
            data[tos2]=num;
        }
    }
    public int pop1(){
        if(tos1 > -1){
            tos1--;
            return data[tos1+1];
        }else {
            System.out.println("Underflow");
            return -1;
        }
    }
    public int pop2(){
        if(tos2< data.length){
            tos1++;
            return data[tos1-1];
        }else {
            System.out.println("Underflow");
            return -1;
        }
    }

    public int size1(){
        return tos1+1;
    }
    public int size2(){
        return data.length-tos2;
    }
}

