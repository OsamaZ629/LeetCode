class Solution {
    public int[] twoSum(int[] nums, int target) {
        HashMap<Integer, Integer> numsHash = new HashMap<>(nums.length);
        int desired, curr;
        for (int i = 0; i < nums.length; i++){
            desired = target - nums[i];
            if (nums[i] == desired && numsHash.containsKey(nums[i])) return new int[]{i, numsHash.get(nums[i])};
            numsHash.put(nums[i], i);
            curr = numsHash.getOrDefault(desired, -1);
            if (curr != -1 && curr != i){
                return new int[] {i, curr};
            }
        }
        return null;
    }
}
