class Solution {
    public double findMedianSortedArrays(int[] nums1, int[] nums2) {
        int m = nums1.length, n = nums2.length;
        int o = m+n;
        int[] fin = new int[o];
        
        int i=0,j=0,k=0;
        while(k<o){
            if(i<m && j<n){
                if(nums1[i] <= nums2[j]){
                    fin[k] = nums1[i];
                    i++;
                }
                else{
                    fin[k] = nums2[j];
                    j++;
                }
            }
            else if(i<m && j>=n){
                fin[k] = nums1[i];
                i++;
            }
            else if(i>=m && j<n){
                fin[k] = nums2[j];
                j++;
            }
            k++;
        }
        return o%2 != 0 ? fin[o/2] : (double)(fin[o/2] + fin[(o/2)-1])/2 ;
    }
}
