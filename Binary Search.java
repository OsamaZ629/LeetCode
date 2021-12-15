class Solution {
    public int search(int[] nums, int target) {
        if (target > nums[nums.length-1] || target < nums[0]) return -1;
        int i = 0;
        int j = nums.length-1;
        int mpoint = (i + j) / 2;
        while (true){
            if (target <= nums[j] && target > nums[mpoint]){
                i = mpoint;
                mpoint = (i + j) / 2;
            }else if (target >= nums[i] && target < nums[mpoint]){
                j = mpoint;
                mpoint = (i + j) / 2;
            }else if (target == nums[mpoint]){
                return mpoint;
            }
            if (i == mpoint || j == mpoint){
                if (target == nums[i]) return i;
                if (target == nums[j]) return j;
                return -1;
            }
        }
    }
}
