class Solution {
    public boolean searchMatrix(int[][] mat, int target) {
        for (int i = 0; i < mat.length; i++){
            if (binSearch(mat[i], target)) return true;
        }
        return false;
    }
    public boolean binSearch(int[] mat, int target) {
        // binary search rows.
        int fir = 0, sec = mat.length - 1, mpoint = (fir + sec) / 2;
        while (fir <= sec){
            if (target == mat[mpoint]) return true;
            else if (target > mat[mpoint]){
                fir = mpoint+1;
                mpoint = (fir + sec) / 2;
            }else {
                sec = mpoint-1;
                mpoint = (fir + sec) / 2;
            }
        }
        return false;
    }
}


// Another more efficent solution after some search.  

class Solution {
    public boolean searchMatrix(int[][] mat, int target) {
        if (mat.length == 0 || mat[0].length == 0) return false;
        int row = 0, col = mat[0].length-1;
        while(row  < mat.length && col >=0){
            if (mat[row][col] == target) return true;
            else if (target < mat[row][col]) col--;
            else row++;
        }
        return false;
    }
}
