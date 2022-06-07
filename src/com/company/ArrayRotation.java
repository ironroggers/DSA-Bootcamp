
public class ArrayRotation {
    public static void main(String[] args) {
        int [] arr = new int[]{3,4,5,6,7,1,2};
//        int index = noOfRotation(arr);
//        System.out.println(index);

        // find an element in a sorted rotated array
        int index2 = findElementInSortedRotatedArray(arr,5);
        System.out.println(index2);

    }

    private static int findElementInSortedRotatedArray(int[] arr, int num) {
        int min = noOfRotation(arr);
        int ind1 = binarySearch(arr,num,0,min-1);
        int ind2 = binarySearch(arr,num,min,arr.length-1);
        return (Math.max(ind1,ind2));

    }
    private static int binarySearch(int[] arr, int num,int start, int end) {
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


    private static int noOfRotation(int[] arr) {
        int start=0;
        int end = arr.length-1;
        if(arr[start]<arr[end]){
            return 0;
        }
        while(start<=end){
            int mid = start + (end-start)/2;
            if(arr[mid]<arr[mid-1] && arr[mid]<arr[mid+1]){
                return mid;
            }else if(arr[mid]<arr[end]){
                end=mid-1;
            }else if(arr[mid]>arr[start]){
                start=mid+1;
            }
        }
        return -1;
    }
}
