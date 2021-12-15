class Solution {
    public int[] twoSum(int[] nums, int target) {
        int start = 0, end = nums.length - 1;
        while(start<end){
            if(nums[start]+nums[end]>target)
                end = end - 1;
            else if(nums[start]+nums[end]<target){
                start = start + 1;
            }else 
                return new int[]{start+1, end+1};
        }
        return new int[]{-1, -1};
    }
}
