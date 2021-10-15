class Solution {
    public void moveZeroes(int[] nums) {
        int zeroes = 0;
        for (int i = 0; i < nums.length; i++){
            if (nums[i] == 0) {
                zeroes++;
                continue;
            }
            nums[i - zeroes] = nums[i];
        }
        for (int i = nums.length - zeroes; i < nums.length; i++){
            nums[i] = 0;
        }
    }
}
