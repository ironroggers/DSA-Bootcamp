public class FirstLastOccurrence {
    public static void main(String[] args) {
        int [] arr = new int[]{1,2,3,4,5,6,7,8,10,10,10,10,10,10,15};
        //First Occurrence
        int fIndex = fOccurrence(10,arr);
        System.out.println(fIndex);
        //Last Occurrence
        int lIndex = lOccurrence(10,arr);
        System.out.println(lIndex);
        // Count the no. of occurrence of a number
        System.out.println(lIndex-fIndex+1);
    }

    private static int lOccurrence(int num, int[] arr) {
        int s=0;
        int e = arr.length-1;
        int ret = -1;
        while(s<=e){
            int m = s+ (e-s)/2;
            if(arr[m]==num){
                ret=m;
                s=m+1;
            }else if(num > arr[m]){
                s=m+1;
            }else{
                e=m-1;
            }
        }
        return ret;
    }


    private static int fOccurrence(int num,int [] arr) {
        int s=0;
        int e = arr.length-1;
        int ret = -1;
        while(s<=e){
            int m = s+ (e-s)/2;
            if(arr[m]==num){
                ret=m;
                e=m-1;
            }else if(num > arr[m]){
                s=m+1;
            }else{
                e=m-1;
            }
        }
        return ret;
    }

}
