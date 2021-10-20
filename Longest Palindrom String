class Solution {
    public int longestPalindrome(String s) {
        int[] arr = new int['z' - 'A'+1];
        int res = 0;
        for (int i = 0; i < s.length(); i++){
            arr[s.charAt(i) - 'A']++;
        }
        int tmp;
        for (int i = 0; i < arr.length; i++){
            res += arr[i] - arr[i] % 2;
        }

        return res >= s.length() ? res: res+1;
    }
}
