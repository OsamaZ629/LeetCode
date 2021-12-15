class Solution {
    
    public int[][] merge(int[][] intervals) {
        int tot = intervals.length;
        for(int i = 0; i < intervals.length; i++){
            if (intervals[i] == null) continue;
            for(int j = 0; j < intervals.length; j++){
                if (i == j || intervals[j] == null) continue;
                int[] merged = getOverlap(intervals[i], intervals[j]);
                if (merged != null) {
                    intervals[j] = null;
                    intervals[i] = merged;
                    tot--;
                }
            }
        }
        // a second round just to make sure, this round will be a lot faster tho.
        for(int i = 0; i < intervals.length; i++){
            if (intervals[i] == null) continue;
            for(int j = 0; j < intervals.length; j++){
                if (i == j || intervals[j] == null) continue;
                int[] merged = getOverlap(intervals[i], intervals[j]);
                if (merged != null) {
                    intervals[j] = null;
                    intervals[i] = merged;
                    tot--;
                }
            }
        }
        int[][] res =  new int[tot][2];
        int j = 0;
        for (int i = 0; i < intervals.length; i++){
            if (intervals[i] != null){
                res[j] = intervals[i];
                j++;
            }
            if (j == tot) break;
        }  
        return res;
    }
    
    
    public int[] getOverlap(int[] fir, int[] sec){
        if (fir[0] < sec[0]){
            if (fir[1] < sec[0]) return null;
            int[] res = new int[2];
            res[0] = fir[0];
            res[1] = fir[1] > sec[1]? fir[1]: sec[1];
            return res;
        }else {
            if (sec[1] < fir[0]) return null;
            int[] res = new int[2];
            res[0] = sec[0];
            res[1] = fir[1] > sec[1]? fir[1]: sec[1];
            return res;
    }
    }
}
