class Solution {
    public boolean wordPattern(String pattern, String s) {
        String[] sarr = s.split(" ");
        char[] patt = pattern.toCharArray();
        if (sarr.length != pattern.length()) return false;
        HashMap<Character, String> map = new HashMap<Character, String>(sarr.length);
        for (int i = 0; i < sarr.length; i++){
            if (map.containsKey(patt[i])){
                if (!sarr[i].equals(map.get(patt[i]))) return false;
            }else{
                if (map.containsValue(sarr[i])) return false;
                map.put(patt[i], sarr[i]);
            }
        }
            return true;
    }
}
