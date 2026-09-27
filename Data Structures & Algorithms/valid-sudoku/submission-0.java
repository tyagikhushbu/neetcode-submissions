class Solution {

    public boolean isValidSudoku(char[][] board) {
        HashMap<Integer, Set<Character>> rowMap = new HashMap();
        HashMap<Integer, Set<Character>> colMap = new HashMap();
        HashMap<Integer, Set<Character>> boxMap = new HashMap();
        
        for(int i = 0; i < board.length; i++){
            for(int j = 0; j < board[0].length; j++){
                if(board[i][j] != '.') {
                    boolean isRowValid = isValid(board, rowMap, i, j, i);
                    boolean isColValid = isValid(board, colMap, i , j, j);
                    boolean isBoxValid = isValid(board, boxMap, i, j, getBoxId(i,j));
                    
                    System.out.println(rowMap +":"+colMap+":"+boxMap);
                    if(!isRowValid || !isColValid || !isBoxValid) return false;
                }
            }
        }
     return true;
    }

    public int getBoxId(int i , int j){
        return ((i/3) * 3) + (j/3);
    }

    public boolean isValid(char[][] board, HashMap<Integer, Set<Character>> map , int i , int j, int key){
        Set<Character> values = map.get(key);
        if(values == null){
            values = new HashSet<>();
        } else {
            if(values.contains(board[i][j])) return false;
        }
        values.add(board[i][j]);
        map.put(key, values);
        return true;
    }
    
}

