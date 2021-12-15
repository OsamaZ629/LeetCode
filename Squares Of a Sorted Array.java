class Solution {
    public int[] sortedSquares(int[] nums) {
        int curr = 0, s = nums.length - 1;
        int[] squaredNums = new int[nums.length];
        for(int i=nums.length-1; i >= 0; i--){
            if (Math.abs(nums[curr]) > nums[s]){
                squaredNums[i] = nums[curr] * nums[curr];
                curr++;
            }else{
                squaredNums[i] = nums[s]*nums[s];
                s--;
            }
        }
        return squaredNums;
    }
}
