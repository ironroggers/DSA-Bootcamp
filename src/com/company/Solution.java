import java.util.*;

public class Solution {
    public static List<List<Integer>> fourSum(int[] nums, int target) {
        Arrays.sort(nums);
        Set<ArrayList<Integer>> set = new HashSet<ArrayList<Integer>>();
        for(int i=0;i<nums.length;i++){
            for(int j=i+1;j<nums.length;j++){
                int left=j+1;
                int right=nums.length-1;
                int res=nums[i]+nums[j];
                int tar = target-res;
                while(left<right){
                    if(nums[left]+nums[right]==tar){
                        ArrayList<Integer> list = new ArrayList<>();
                        list.add(nums[i]);
                        list.add(nums[j]);
                        list.add(nums[left]);
                        list.add(nums[right]);
                        Collections.sort(list);
                        set.add(list);left++;
                    }else if(nums[left]+nums[right]>tar){
                        right--;
                    }else{
                        left++;
                    }
                }
            }
        }

        List<List<Integer>> ans = new ArrayList<List<Integer>>();
        for(List<Integer> temp : set){
            ans.add(temp);
        }
        return ans;
    }

    public static void main(String[] args) {
        int [] nums = new int[]{1,0,-1,0,-2,2};
        List<List<Integer>> ans = fourSum(nums,0);
        System.out.println(ans);
        System.out.println("Hey");
    }
}