\\ O(n) time, O(1) space solution.
class Solution {
    public int majorityElement(int[] nums) {
        int tot = 0, count = 0, maj = nums[(int)( Math.random() * nums.length)];
        while (true){
            for(int i = 0; i < nums.length; i++){
                if (nums[i] == maj) count++;
                if (count > nums.length / 2) return maj;
            }
            count = 0;
            maj = nums[(int)(Math.random() * nums.length)];
            if(tot == nums.length -1) break;
        }
        return -1;
    }
}

\\ HashMap solution

class Solution {
    public int majorityElement(int[] nums) {
        if (nums.length == 1) return nums[0];
        HashMap<Integer, Integer> map = new HashMap<Integer, Integer>(nums.length / 2 + 1);
        Integer tmp;
        for (int i = 0; i < nums.length; i++){
            tmp = map.get(nums[i]);
            if (tmp != null){
                if (tmp >= nums.length / 2){
                    return nums[i];
                }else{
                    map.replace(nums[i], tmp+1);
                }
            }else{
                map.put(nums[i], 1);
            }
        }
        return -1;
    }
}
