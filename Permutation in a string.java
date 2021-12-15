class Solution {
    public boolean checkInclusion(String s1, String s2) {
        int n = s1.length(), count=0;
        if (n > s2.length()) return false;
        int[] arr = new int[26];
        char tmp;
        for(int j = 0; j < n; j++){
            tmp = s1.charAt(j);
            arr[tmp - 'a']++;
        }

        for(int j = 0; j < n; j++){
            tmp = s2.charAt(j);
            arr[tmp - 'a']--;
            if (arr[tmp - 'a'] >= 0) count++;

        }
        if (count == n) return true;

        for (int i = n; i < s2.length(); i++){
            tmp = s2.charAt(i-n);
            arr[tmp - 'a']++;
            if (arr[tmp - 'a'] >= 1) count--;
            tmp = s2.charAt(i);
            arr[tmp - 'a']--;
            if (arr[tmp - 'a'] >= 0) count++;
            if (count == n) return true;
        }
        return false;
    }
}
