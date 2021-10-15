class Solution {
    public int[] intersect(int[] nums1, int[] nums2) {
        int[] shorter, longer;
        if (nums1.length < nums2.length){
            shorter = nums1;
            longer = nums2;
        }else{
            shorter = nums2;
            longer = nums1;
        }
        
        HashMap<Integer, Integer> nums2Map = new HashMap(shorter.length);
        int interNum = 0, resCounter = 0;
        Integer curr;
        for(int i = 0; i < shorter.length; i++){
            curr = nums2Map.get(shorter[i]);
            if (curr != null) nums2Map.replace(shorter[i], curr+1);
            else nums2Map.put(shorter[i], 1);
            interNum++;
        }
        int[] tmpRes = new int[interNum];
        Integer s;
        for (int i = 0; i < longer.length; i++){
            s = nums2Map.get(longer[i]);
            if (s != null && s > 0) {
                tmpRes[resCounter] = longer[i];
                resCounter++;
                nums2Map.replace(longer[i], s-1);
            }
        }
        int[] res = new int[resCounter];
        System.arraycopy(tmpRes, 0, res, 0, resCounter);
        return res;
    }
}
