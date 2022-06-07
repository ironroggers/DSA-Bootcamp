public class LinkedList {
    Node head;
    static class Node{
        int data;
        Node next;
        Node(int d){
            this.data=d;
            this.next=null;
        }
    }
    public void printList(){
        Node n = head;
        while(n!=null){
            System.out.print(n.data+"->");
            n=n.next;
        }
        System.out.println("null");
    }
    public void insert(int pos,int val){
        Node n = head;
        while(--pos!=0){
            n=n.next;
        }
        Node temp = new Node(val);
        temp.next = n.next;
        n.next=temp;
    }

    public static void main(String[] args) {
        LinkedList ll = new LinkedList();
        ll.head = new Node(1);
        Node s = new Node(2);

        Node t = new Node(3);

        Node f = new Node(4);

        Node fi = new Node(5);

        Node si = new Node(6);
        ll.head.next=s;
        s.next=t;
        t.next=f;
        f.next=fi;
        fi.next=si;
        ll.insert(7,10);
        ll.printList();
    }
}
