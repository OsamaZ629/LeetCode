class Solution {
    public boolean canConstruct(String ransomNote, String magazine) {
        int[] s = new int[26];
        char c;
        int count = ransomNote.length();
        
        for (int i = 0; i < count; i++){
            s[ransomNote.charAt(i) - 'a']++;
        }
        for (int i = 0; i < magazine.length(); i++){
            c = magazine.charAt(i);
            if (s[c-'a'] > 0) count--;
            s[c - 'a']--;
            
        }
        return count == 0;
    }
}
