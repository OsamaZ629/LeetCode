class Solution {
    public int firstUniqChar(String s) {
        int[] chars = new int[26];
        char[] trueChars = s.toCharArray();
        for (int i = 0; i < trueChars.length; i++){
            chars[trueChars[i] - 'a'] += 1;
        }
        for (int i = 0; i < trueChars.length; i++){
            if (chars[trueChars[i] - 'a'] == 1){
                return i;
            }
        }
        return -1;
    }
}
