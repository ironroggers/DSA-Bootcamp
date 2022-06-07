public class BinarySortedArray {
    public static void main(String[] args) {
        int [] arr = new int[]{0,0,0,0,0,0,0,0,0,0,0};
        int index = firstOneIndex(arr);
        System.out.println(index);

    }

    private static int firstOneIndex(int[] arr) {
        int start  = 0;
        int end = arr.length-1;
        int left=-1;
        while(start<=end){
            int mid = start+ (end-start)/2;
            if(arr[mid]==1){
                left=mid;
                end = mid-1;
            }else if(arr[mid]==0){
                start=mid+1;
            }
        }
        return left;
    }
}
