class Solution {
    public boolean isAnagram(String s, String r) {
        if (s.length() != r.length()) return false;
        int[] chars = new int[26];
        char c;
        
        for (int i = 0; i < s.length(); i++){
            chars[s.charAt(i) - 'a']++;
        }
        for (int i = 0; i < s.length(); i++){
            c = r.charAt(i);
            if (--chars[c-'a'] >= 0) continue;
            return false;
            
        }
        return true;
    }
}
