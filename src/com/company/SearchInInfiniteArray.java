public class SearchInInfiniteArray {
    public static void main(String[] args) {
        int [] arr = new int[50];
        int num = 10;
        int start=0;
        int end=1;
        boolean flag = true;
        while(flag){
            int index = searchInInfiniteArray(arr,num,0,end);
            if(index!=-1){
                System.out.println(index);
                flag = false;
            }else {
                start = end+1;
                end=end*2;
            }
        }
    }
    public static int searchInInfiniteArray(int [] arr, int num, int start, int end){
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
