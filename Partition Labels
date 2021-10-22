class Solution {
    public List<Integer> partitionLabels(String s) {
        char[] c = s.toCharArray();
        int[] last = new int[26];
        
        for (int i = 0 ; i < c.length; i++){
             last[c[i] - 'a'] = i;
        }
        
        
        ArrayList<Integer> ss = new ArrayList<Integer>();
        int start = 0, end = 0;
        for (int i = 0; i < s.length(); i++){
            end = Math.max(end, last[c[i] - 'a']);
            if (end == i){
                ss.add(end - start + 1);
                start = end + 1;
            }
        }
        
        return ss;
    }
}
