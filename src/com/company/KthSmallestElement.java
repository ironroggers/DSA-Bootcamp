import java.util.Collections;
import java.util.PriorityQueue;

public class KthSmallestElement {
    public static void main(String[] args) {
        int [] arr = new int[]{7,6,8,23,45,19,4,9};
        int k=3;
        PriorityQueue<Integer> maxHeap = new PriorityQueue<Integer>(Collections.reverseOrder());
        for(int i=0;i<arr.length;i++){
            maxHeap.add(arr[i]);
            if(maxHeap.size()>k){
                maxHeap.remove();
            }
        }
        System.out.println(maxHeap.peek());
    }

}
