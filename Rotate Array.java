class Solution {
    public void rotate(int[] nums, int k) {
        int n = nums.length;
        int curr = nums[0], i = k % n, jumps = 0, sig = curr;
        int[] carry = new int[n];
        for(int j=0; j < n; j++){
            int newPos = (j + k) % n;
            carry[newPos] = nums[j];
        }
        for(int j=0; j < n; j++){
            nums[j] = carry[j];
        }
    }
}
