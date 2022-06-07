//import java.util.ArrayDeque;
//
////public class Queue {
//    public static void main(String[] args) {
//        CustomQueue que = new CustomQueue(5);
//
//        que.add(10);
//        que.add(20);
//        que.add(30);
//        que.add(40);
//        que.add(50);
//        que.display();
//        que.remove();
//        que.remove();
//        que.remove();
//        que.remove();
//        que.display();
//        que.add(60);
//        que.add(70);
//        que.add(80);
//        que.add(90);
//        que.display();
//        que.remove();
//        que.add(100);
//        que.display();
//    }
//}
//class CustomQueue{
//    int [] data;
//    int front;
//    int size;
//    CustomQueue(int cap){
//        data = new int[cap];
//        front=0;
//        size=0;
//    }
//    public void add(int num){
//        if(size == data.length){
//            System.out.println("Queue Overflow");
//        }else {
//            int idx = (front+size)% data.length;
//            data[idx]=num;
//            size++;
//        }
//    }
//    public int remove(){
//        int res = 0;
//        if(size>0){
//            res=data[front];
//            front = (front+1)% data.length;
//            size--;
//            return res;
//        } else {
//            System.out.println("Queue Underflow");
//        }
//        return -1;
//    }
//    public int peek(){
//        int res = 0;
//        if(size>0){
//            res=data[front];
//            return res;
//        } else {
//            System.out.println("Queue Underflow");
//        }
//        return -1;
//    }
//    public void display(){
//        for(int i=0;i<size;i++){
//            int idx = (front+i)%data.length;
//            System.out.print(data[idx]+" ");
//        }
//        System.out.println();
//    }
//}
