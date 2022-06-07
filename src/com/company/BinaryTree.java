import java.awt.color.ICC_ColorSpace;
import java.util.ArrayDeque;
import java.util.ArrayList;
import java.util.Queue;
import java.util.Stack;

public class Main {
    public static class Node{
        int data;
        Node left;
        Node right;
        Node(int data, Node left,Node right){
            this.data=data;
            this.left=left;
            this.right=right;
        }
    }
    public static class Pair{
        Node node;
        int state;
        Pair(Node node, int state){
            this.node = node;
            this.state=state;
        }
    }

    public static void main(String[] args) {
        Integer [] arr={50,25,12,null,null,37,30,null,null,null,75,62,null,70,null,null,57,null,null};
        Stack<Pair> st = new Stack<>();
        Node root = new Node(arr[0],null,null);
        Pair p = new Pair(root,1);
        st.push(p);
        int x=1;
        while(!st.isEmpty()){
            if(st.peek().state==1){
                if(arr[x]==null){
                    st.peek().node.left=null;
                    st.peek().state+=1;x++;
                }else{
                    Node t = new Node(arr[x],null,null);
                    st.peek().node.left=t;
                    st.peek().state+=1;x++;
                    st.push(new Pair(t,1));
                }

            }else if(st.peek().state==2){
                if(arr[x]==null){
                    st.peek().node.right=null;
                    st.peek().state+=1;x++;
                }else{
                    Node t = new Node(arr[x],null,null);
                    st.peek().node.right=t;
                    st.peek().state+=1;x++;
                    st.push(new Pair(t,1));
                }
            }else if(st.peek().state==3){
                st.pop();
            }
        }
        display(root);
        System.out.println(max(root));
        System.out.println(sum(root));
        System.out.println(size(root));
        System.out.println(height(root));
        preTraversal(root);
        System.out.println();
        inTraversal(root);
        System.out.println();
        postTraversal(root);
        System.out.println();
        levelTraversal(root);
        nToRootPath(root,30);
        System.out.println(list);
    }
    public static void display(Node node) {
        if(node==null){
            return;
        }
        String str = "";
        if(node.left==null){
            str+=".";
        }else{
            str+=node.left.data;
        }
        str+=" <- "+node.data+" -> ";
        if(node.right==null){
            str+=".";
        }else{
            str+=node.right.data;
        }
        System.out.println(str);
        display(node.left);
        display(node.right);
    }
    public static int max(Node node){
        if(node == null){
            return 0;
        }
        int temp = node.data;
        int t1 = max(node.left);
        if(temp<t1){
            temp=t1;
        }
        int t2 = max(node.right);
        if(temp<t2){
            temp=t2;
        }
        return temp;
    }
    public static int sum(Node node){
        if(node==null){
            return 0;
        }
        int s = node.data;
        s+=sum(node.left)+sum(node.right);
        return s;
    }
    public static int size(Node node){
        if(node==null){
            return 0;
        }
        int h = 1 + size(node.left) + size(node.right);
        return h;
    }
    public static int height(Node node){
        if(node==null){
            return -1;
        }
        int h = 0;
        return 1+Math.max(height(node.left),height(node.right));
    }
    public static void preTraversal(Node node){
        if(node == null){
            return;
        }
        System.out.print(node.data+"-");
        preTraversal(node.left);
        preTraversal(node.right);


    }
    public static void inTraversal(Node node){
        if(node == null){
            return;
        }
        preTraversal(node.left);
        System.out.print(node.data+"-");
        preTraversal(node.right);


    }
    public static void postTraversal(Node node){
        if(node == null){
            return;
        }
        preTraversal(node.left);
        preTraversal(node.right);
        System.out.print(node.data+"-");

    }
    public static void levelTraversal(Node node){
        Queue<Node> que = new ArrayDeque<>();
        que.add(node);
        while(!que.isEmpty()){
            int count = que.size();
            for(int i=0;i<count;i++){
                node=que.remove();
                System.out.print(node.data + "-");
                if(node.left!=null){
                    que.add(node.left);
                }
                if(node.right!=null){
                    que.add(node.right);
                }
            }
            System.out.println();
        }
    }
    static ArrayList<Integer> list = new ArrayList<>();
    public static boolean nToRootPath(Node node,int n){
        if(node==null){
            return false;
        }
        if(node.data==n){
            list.add(node.data);
            return true;
        }
        if(nToRootPath(node.left,n)){
            list.add(node.data);
            return true;
        }
        if(nToRootPath(node.right,n)){
            list.add(node.data);
            return true;
        }
        return false;
    }


}
