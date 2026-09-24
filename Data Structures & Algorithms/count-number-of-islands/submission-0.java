class Solution {
    int rows;
    int cols;
    public int numIslands(char[][] grid) {
        this.rows = grid.length;
        this.cols = grid[0].length;

        boolean [][] visited = new boolean [rows][cols];
        int islands = 0;
        for(int i = 0; i<rows; i++){
            for(int j = 0; j<cols; j++){
                if(grid[i][j] == '1' && !visited[i][j]) {
                 dfs(grid, i, j, visited);
                 islands++;
                }
            }
        }
        return islands;
    }

    public void dfs(char[][] grid, int row, int col, boolean [][] visited) {

        if(row < 0 || col < 0 || row >= rows || col >= cols || grid[row][col] == '0' || (visited[row][col]))
            return;
        
        visited[row][col] = true;

        dfs(grid, row+1, col, visited);
        dfs(grid, row-1, col, visited);
        dfs(grid, row, col+1, visited);
        dfs(grid, row, col-1, visited);
    }
}
