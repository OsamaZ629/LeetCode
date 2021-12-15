class Solution {
    public int subarraySum(int[] nums, int k) {
        if (nums.length == 1) return nums[0] == k ? 1: 0;
        
        HashMap<Integer, Integer> map = new HashMap<Integer, Integer>(nums.length);
        int count = 0;
        if (nums[0] == k) count++;
        map.put(nums[0], 1);
        for (int i = 1; i < nums.length; i++){
            nums[i] += nums[i-1];
            if (nums[i] == k) count++;
            if (map.containsKey(nums[i] - k)){
                count += map.get(nums[i] - k);
            }
            if (!map.containsKey(nums[i])) map.put(nums[i], 1);
            else map.put(nums[i], map.get(nums[i])+1);
        }
        return count;
    }
}
