import java.util.Arrays;
import java.util.PriorityQueue;

public class KSortedArray {
    public static void main(String[] args) {
        int [] arr = new int[]{6,5,3,2,8,10,9};
        int k=3;
        PriorityQueue<Integer> minHeap = new PriorityQueue<>();
        int [] arr2 = new int[arr.length];
        int a=0;
        for(int i=0;i<arr.length;i++){
            minHeap.add(arr[i]);
            if(minHeap.size()>k){
                arr2[i-3]=minHeap.peek();
                a=i-3;
                minHeap.remove();
            }
        }

        for(int i=a+1;i<a+4;i++){
            arr2[i]= minHeap.peek();
            minHeap.remove();
        }
        System.out.println(Arrays.toString(arr2));

    }
}
