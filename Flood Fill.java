class Solution {
    public int[][] floodFill(int[][] image, int sr, int sc, int newColor) {
        if (newColor != image[sr][sc])
        floodFill(image, sr, sc, newColor, image[sr][sc], Integer.MAX_VALUE, Integer.MAX_VALUE);
        return image;
    }

    public void floodFill(int[][] image, int sr, int sc, int newColor, int originColor, int prevSr, int prevSc) {
        if (sr < 0 || sc < 0 || sr >= image.length || sc >= image[0].length) return;
        if (image[sr][sc] == originColor) {
            image[sr][sc] = newColor;
            if (sr+1 != prevSr) floodFill(image, sr+1, sc, newColor, originColor, sr, sc);
            if (sr-1 != prevSr) floodFill(image, sr-1, sc, newColor, originColor, sr, sc);
            if (sc+1 != prevSc) floodFill(image, sr, sc+1, newColor, originColor, sr, sc);
            if (sc-1 != prevSc) floodFill(image, sr, sc-1, newColor, originColor, sr, sc);
        }
    }
}
