import java.lang.reflect.Array;
import java.util.ArrayDeque;
import java.util.ArrayList;
import java.util.Queue;
import java.util.Stack;

public class Main {
    private static class Node{
        int data;
        ArrayList<Node> children = new ArrayList<>();
    }

    public static void main(String[] args) {
        int [] arr = {80,10,50,-1,60,-1,70,-1,-1,20,90,140,-1,-1,100,-1,-1,30,110,150,-1,-1,-1,40,120,-1,130,-1,-1,-1};
        Stack<Node> st = new Stack<>();
        Node root = new Node();

        for(int i=0;i<arr.length;i++){
            if(arr[i]==-1){
                st.pop();
            }else{
                Node t = new Node();
                t.data=arr[i];
                if(!st.isEmpty()){
                    st.peek().children.add(t);
                }else{
                    root=t;
                }
                st.push(t);
            }
        }
        display(root);
        System.out.println(size(root));
        System.out.println(max(root));
        System.out.println(height(root));
        traverse(root);
        System.out.println();
        levelTraverse(root);
    }
    public static void display(Node root){
        String str = root.data + " -> ";
        for(Node child : root.children){
            str += child.data+",";
        }
        System.out.println(str);
        for (Node child: root.children){
            display(child);
        }
    }
    public static int size(Node root){
        int count=1;
        for(Node child : root.children){
            count+=size(child);
        }
        return count;
    }
    public static int max(Node root){
        int max = root.data;
        for(Node child : root.children){
            int t = max(child);
            if(t>max){
                max=t;
            }
        }
        return max;
    }

    public static int height(Node root){
        int m = 0;
        for(Node child : root.children){
            int t = 1+height(child);
            if(t>m){
                m=t;
            }
        }
        return m;
    }
    public static void traverse(Node root){
        System.out.print(root.data + "->");
        for(Node child : root.children){
            traverse(child);
        }
    }
    public static void levelTraverse(Node root){
        Queue<Node> que = new ArrayDeque<>();
        que.add(root);
        while(!que.isEmpty()){

            Node temp = que.remove();
            System.out.print(temp.data+", ");
            for(Node ch : temp.children){
                que.add(ch);
            }

        }
        System.out.println("Done");
    }
}