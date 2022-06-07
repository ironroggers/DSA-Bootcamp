public class MaxElementLessThanNum {
    public static void main(String[] args) {
        int num = 5;
        int [] arr = new int[]{1,2,3,5,8,10,10,12,19};
        int index = findMaxElementLessThanNum(arr,num);
        System.out.println(index);
    }

    private static int findMaxElementLessThanNum(int[] arr, int num) {
        int start =0;
        int end = arr.length-1;
        while(start<=end){
            int mid = start+(end-start)/2;
            if(arr[mid]>num){
                end=mid-1;
            }else if(arr[mid]<num && num>arr[mid+1]){
                start=mid+1;
            }else if(arr[mid]<num && num<=arr[mid+1]){
                return mid;
            }
        }
        return -1;
    }
}
