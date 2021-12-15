class Solution {
    public int searchInsert(int[] nums, int target) {
        int i = 0, j = nums.length, mpoint = i + (j - i) / 2;
        if (target < nums[i]) return i;
        else if (target > nums[j-1]) return j;
        while(i < j){
            if (nums[mpoint] == target || (target < nums[mpoint] && target > nums[mpoint-1])) return mpoint;
            if (target < nums[mpoint]){
                j = mpoint-1;
                mpoint = i + (j - i) / 2;
            }else if (target > nums[mpoint]){
                i = mpoint+1;
                mpoint = i + (j - i) / 2;
            }
        }
        if (nums[i] == target || (target < nums[i] && target > nums[i-1])) return i;
        else return j;
    }
}
