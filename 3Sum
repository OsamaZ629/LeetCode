import java.util.Arrays;

class Solution {
    public List<List<Integer>> threeSum(int[] nums) {
        
        // First sort the array, then start from first element
        // and look for 2 elements from left and right ends that will make the result set
        // nums = [-1,0,1,2,-1,-4]
        
        Arrays.sort(nums);
        
        // nums = [-4,-1,-1,0,1,2]
        List<List<Integer>> res = new ArrayList<List<Integer>>();
        List<Integer> temp = new ArrayList<Integer>();
        int len = nums.length;
        if(len < 3) return res;
        int left, right;
        for (int i = 0; i < len; i++){
            left = i+1;
            right = len-1;
            int lval = Integer.MAX_VALUE, rval = Integer.MIN_VALUE;
            if (i > 0 && nums[i] == nums[i-1]) continue;
            while (left < right){
                if (nums[i] + nums[left] + nums[right] == 0 && nums[left] != rval && lval != nums[left]){
                    List<Integer> r = new ArrayList<>(3);
                    r.add(nums[i]);
                    r.add(nums[left]);
                    r.add(nums[right]);
                    res.add(r);
                    lval = nums[left];
                    rval = nums[right];
                    left++;
                    right--;
                }
                else if (nums[i] + nums[left] + nums[right] > 0) right--;
                else left++;
            }
        }
       return res; 
    }
}
