//import java.util.HashMap;
import java.util.*;

public class Frequent {
    public static void main(String[] args) {
        int [] arr = new int[]{1,2,1,2,3,3,4,5,6,6,6,6,5,5,4,3,2,1};
        Map<Integer,Integer> map  = new HashMap<>();
        for(int i=0;i<arr.length;i++){
            if(!map.containsKey(arr[i])){
                map.put(arr[i],1);
            }else {
                map.put(arr[i],map.get(arr[i])+1);
            }
        }
        class Pair{
            int key;
            int value;
            Pair(){

            }
            Pair(int key, int value){
                this.key = key;
                this.value=value;
            }


        }
        PriorityQueue<Pair> minHeap = new PriorityQueue<>((o1, o2) ->{
            if(o1.value>o2.value){
                return 1;
            }else{
                return 0;
            }
        });
        for(int i=0;i<arr.length;i++){

        }



    }
}
//class Astavinayak{
//    Astavinayak(){
//
//    }
//    int nidhi;
//    int himani;
//    int aditi;
//    int harshita;
//    int komal;
//    int kimaya;
//    int sagarika;
//    int sneha;
//    int neha;
//    int rachita;
//    int radha;
//    int Alexia;
//    int Ivanka;
//    int emma;
//    int zoya;
//    int scarlett;
//    int Olivia;
//    int Charlotte;
//    int Amelia;
//    int Ava;
//    int Sophia;
//    int Isabella;
//    int Mia;
//}