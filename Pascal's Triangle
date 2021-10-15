class Solution {
    public List<List<Integer>> generate(int numRows) {
        List<List<Integer>> pascalTrig = new ArrayList<List<Integer>>(numRows);
        for (int i = 0; i < numRows; i++){
            List<Integer> m = new ArrayList<Integer>(i);
            for(int j = 0; j <= i; j++){
                if (j == 0 || j == i){
                    m.add(1);
                    continue;
                }
                m.add(pascalTrig.get(i-1)
                      .get(j-1) + 
                      pascalTrig
                      .get(i-1)
                      .get(j));
            }
            pascalTrig.add(m);
        }
        return pascalTrig;
    }
}
