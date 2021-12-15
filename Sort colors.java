class Solution {
    public void sortColors(int[] nums) {
        int idx=0;
        for (int i = 0; i < nums.length; i++){
            if (nums[i] == 0){
                int tmp = nums[i];
                nums[i] = nums[idx];
                nums[idx] = tmp;
                idx++;
            }
        }
        for (int i = 0; i < nums.length; i++){
            if (nums[i] == 1){
                int tmp = nums[i];
                nums[i] = nums[idx];
                nums[idx] = tmp;
                idx++;
            }
        }
    }
}
