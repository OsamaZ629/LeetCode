class Solution {
    public int[] productExceptSelf(int[] nums) {
        int tot = 1;
        boolean singleZero = false, multipleZeroes = false;
        for (int i = 0; i < nums.length; i++){
            if (nums[i] == 0) {
                if (singleZero) multipleZeroes = true;
                else singleZero = true;
                continue;
            }
            tot *= nums[i];
        }
        for (int i = 0; i < nums.length; i++){
            if (multipleZeroes){
                nums[i] = 0;
                continue;
            }else if (singleZero){
                if (nums[i] == 0) nums[i] = tot;
                else nums[i] = 0;
                continue;
            } 
            nums[i] = tot / nums[i];
        }
        return nums;
    }
}



\\ less memory effiecint solution, but doesn't use division as given by the quesstion.
class Solution {
    public int[] productExceptSelf(int[] nums) {
        int[] answer = new int[nums.length];
        int tmp = 1;
        
        for (int i = 0; i < nums.length; i++){
            answer[i] = tmp;
            tmp *= nums[i];
        }

        tmp = 1;
        for (int i = nums.length-1; i >= 0; i--){
            answer[i] *= tmp;
            tmp *= nums[i];
        }
        
        return answer;
    }
}
