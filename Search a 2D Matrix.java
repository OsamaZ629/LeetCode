class Solution {
    public int m(int[][] matrix, int idx){
        return matrix[idx / matrix[0].length][idx % matrix[0].length];
    }
    public boolean searchMatrix(int[][] matrix, int target) {
        int i = 0, j = matrix.length * matrix[0].length, mpoint = j / 2;

        while (i < j){
            if(target < m(matrix, mpoint)){
                j = mpoint;
                mpoint = (i + j) / 2;
            }else if(target > m(matrix, mpoint)){
                i = mpoint+1;
                mpoint = (i + j) / 2;
            }else{
                return true;
            }
        }
        return false;
    }
}
