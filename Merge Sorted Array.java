class Solution {
    public void merge(int[] nums1, int m, int[] nums2, int n) {
        int k = nums1.length-1;     
        int[] ans = new int[k+1];
        m--;
        n--;
        while(m >= 0 && n >= 0){
            if (nums1[m] > nums2[n]){
                ans[k] = nums1[m];
                m--;
            }else{
                ans[k] = nums2[n];
                n--;
            }
            k--;
        }
        while(m >= 0){
            ans[k] = nums1[m];
            m--;
            k--;
        }
        while(n >= 0){
            ans[k] = nums2[n];
            n--;
            k--;
        }  
        for (int i = 0; i < ans.length; i++){
            nums1[i] = ans[i];
        }
    }
}
