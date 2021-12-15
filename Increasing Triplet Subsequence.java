class Solution {
    public boolean increasingTriplet(int[] nums) {
        if (nums.length < 3) return false;
        int fir = Integer.MAX_VALUE, sec= Integer.MAX_VALUE;
        for (int id = 0; id < nums.length; id++){
            if (nums[id] <= fir) fir = nums[id];
            else if (nums[id] <= sec) sec = nums[id];
            else return true;
        }
        return false;
    }
}
