class Solution {
  public List<List<String>> groupAnagrams(String[] strs) {
    List<List<String>> result = new ArrayList<>();
    Map<String, List<String>> map = new HashMap<>();
    
      for (int i = 0; i < strs.length; i++){
          char[] c = strs[i].toCharArray();
          Arrays.sort(c);
          String s = new String(c);
          List<String> tmp = map.get(s);
          if (tmp != null){
              tmp.add(strs[i]);
          }else{
              result.add(new ArrayList<String>());
              result.get(result.size()-1).add(strs[i]);
              map.put(s, result.get(result.size()-1));
          }
          
      }
    return result;
  }
  
}
