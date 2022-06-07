public class BinarySearch {
    public static void main(String[] args) {
        int [] arr = new int[]{1,2,3,4,5,6,7,8,9,10,11,12,13,14,15};
        int index = binarySearch(arr,99);
        System.out.println(index);
    }

    private static int binarySearch(int[] arr, int num) {
        int start=0;
        int end = arr.length-1;
        while(start<=end){
            int mid = start + (end-start)/2;
            if(arr[mid]==num){
                return mid;
            }else if(num>mid){
                start=mid+1;
            }else{
                end=mid-1;
            }
        }
        return -1;
    }
}
