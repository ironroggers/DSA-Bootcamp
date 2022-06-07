import java.util.*;
class Pair{
    int key;
    int value;
    Pair(int key,int value){
        this.key=key;
        this.value = value;
    }

    public int getKey() {
        return key;
    }

    public int getValue() {
        return value;
    }

    public void setKey(int key) {
        this.key = key;
    }

    public void setValue(int value) {
        this.value = value;
    }
}
public class KClosestNumber{
    public static void main(String[] args) {
        int [] arr = new int[]{5,6,7,8,9};
        int n = 7;
        int k = 3;
        PriorityQueue<Pair> maxHeap = new PriorityQueue<>((o1,o2)->{
            if(o1.value<o2.value){
                return 1;
            }else {
                return 0;
            }
        });
        for(int i=0;i<arr.length;i++){
            if(maxHeap.size()<k){
                maxHeap.add(new Pair(arr[i],Math.abs(arr[i]-n)));
            }
            else if(maxHeap.peek().value > Math.abs(arr[i]-n)){
                maxHeap.remove();
                maxHeap.add(new Pair(arr[i],Math.abs((arr[i]-n))));
            }
        }
        while (!maxHeap.isEmpty()){
            System.out.print(maxHeap.peek().getKey() + ", ");
            maxHeap.remove();
        }
    }

}
