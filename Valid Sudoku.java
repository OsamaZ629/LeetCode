class Solution {
    public boolean isValidSudoku(char[][] board) {
        HashMap<Integer, HashSet<Character>> rowSet = new HashMap<Integer, HashSet<Character>>(9);
        HashMap<Integer, HashSet<Character>> colSet = new HashMap<Integer, HashSet<Character>>(9);
        HashMap<Integer, HashSet<Character>> boxSet = new HashMap<Integer, HashSet<Character>>(9);
        
        for (int i = 0; i < 9; i++){
            rowSet.put(i, new HashSet<Character>(9));
            colSet.put(i, new HashSet<Character>(9));
            boxSet.put(i, new HashSet<Character>(9));
        }
        
        for (int r = 0; r < 9; r++){
            for(int c = 0; c < 9; c++){
                if (board[r][c] != '.'){
                    int currBox = 3 * (r/3) + c/3;
                    
                    if (!rowSet.get(r).add(board[r][c])) return false;
                    if (!colSet.get(c).add(board[r][c])) return false;
                    if (!boxSet.get(currBox).add(board[r][c])) return false;
                }
            }
        }
        return true;
    }
}
