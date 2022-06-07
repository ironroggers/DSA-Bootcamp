public class ReversePairs {
    public static int reversePairs(int[] nums) {
        int count=0;
        long[] arr = new long[nums.length];
        for(int i =0;i<nums.length;i++){
            arr[i]=nums[i];
        }
        for(int i=0;i<nums.length;i++){
            for(int j=i+1;j<nums.length;j++){
                if(arr[i]>(2*arr[j])){
                    count++;
                }
            }
        }
        return count;
    }

    public static void main(String[] args) {
        int [] nums = new int[]{2147483647,2147483647,2147483647,2147483647,2147483647,2147483647};
        int ans = reversePairs(nums);
        System.out.println(ans);
    }
}
