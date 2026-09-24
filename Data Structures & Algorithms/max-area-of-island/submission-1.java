class Solution {
    int rows;
    int cols;
    public int maxAreaOfIsland(int[][] grid) {
        int maxIslandArea = 0;
        this.rows = grid.length;
        this.cols = grid[0].length;
        boolean [][] visited = new boolean[rows][cols];

        for(int i=0; i<rows; i++) {
            for(int j=0; j<cols; j++) {
                int count = 0;
                if(grid[i][j]== 1 && !visited[i][j]) {
                    count = dfs(grid, i, j, visited);
                    System.out.println(count);
                    if(count > maxIslandArea) {
                        maxIslandArea = count;
                       
                    }

                }
            }
        }
        return maxIslandArea;
    }

    public int dfs(int [][] grid, int row, int col, boolean [][] visited) {
        if(row < 0 || col < 0 || row >= rows || col >= cols || visited[row][col] == true || grid[row][col] == 0) {
            return 0;
         }

        visited[row][col] = true;
        
        int count = 1;
        count += dfs(grid, row+1, col, visited);
        count += dfs(grid, row-1, col, visited);
        count += dfs(grid, row, col+1, visited);
        count += dfs(grid, row, col-1, visited);
        return count;
    }
    
}
