public class AllocateMinNumOfPages {
    public static void main(String[] args) {
        int [] arr = new int[]{10,20,30,40};
        int k = 2;
        int min = -1;
        int start = Integer.MIN_VALUE;
        for(int i=0;i<arr.length;i++){
            if(arr[i]>start){
                start=arr[i];
            }
        }
        int end = 0;
        for(int i=0;i<arr.length;i++){
            if(arr[i]!=start){
                end+=arr[i];
            }
        }
        while(start<=end){
            int mid = start + (end-start)/2;
            if(isValid(arr,mid,k)){
                min = mid-1;
                end=mid-1;
            }else{
                start=mid+1;
            }
        }
        System.out.println(min);
    }

    private static boolean isValid(int [] arr, int mid, int k) {
        int allot=0;
        int n=1;
        for(int i=0;i<arr.length;i++){
            if(allot+arr[i]<mid){
                allot+=arr[i];
            }else{
                n++;
                allot=0;
            }
        }
        if(n==k){
            return true;
        }
        return false;



    }
}
