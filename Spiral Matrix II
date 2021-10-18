class Solution {
    public int[][] generateMatrix(int n) {
        int[][] res = new int[n][n];
        int nn = (int)Math.pow(n, 2);
        int startCol=0, startRow=0, dirSteps = n-1;
        for(int i = 1; i <= nn; i++){
            for(int j = 0; j <= dirSteps; j++){
                res[startRow][j + startCol] = i;
                i++;
            }
            for(int j = 1; j <= dirSteps; j++){
                res[startRow + j][startCol + dirSteps] = i;
                i++;
            }
            for(int j = 1; j <= dirSteps; j++){
                res[startRow + dirSteps][startCol + dirSteps - j] = i;
                i++;
            }
            for(int j = 1; j <= dirSteps-1; j++){
                res[startRow + dirSteps - j][startCol] = i;
                i++;
            }
            i--;
            dirSteps-=2;
            startCol++;
            startRow++;
        }
        return res;
    }
}
