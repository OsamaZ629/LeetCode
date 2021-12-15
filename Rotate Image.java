class Solution {
    public void rotate(int[][] matrix) {
        int n = matrix.length;
        int[] tmp;
        int tmpN;
        for (int i = 0; i < n/2; i++){
            tmp = matrix[i];
            matrix[i] = matrix[n-1-i];
            matrix[n-1-i] = tmp;
        }
        for (int i = 0; i < n; i++){
            for (int j = i; j < n; j++){
                tmpN = matrix[i][j];
                matrix[i][j] = matrix[j][i];
                matrix[j][i] = tmpN;
            }
        }
    }
}
