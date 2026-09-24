class Solution {

    public int countPaths(int[][] grid) {
        boolean[][] visited = new boolean[grid.length][grid[0].length];
        return countPath(grid, 0, 0, visited);
    }

    public int countPath(int [][] grid, int row, int col, boolean[][] visited) {

        if(row < 0 || col < 0 
        || row > grid.length-1 || col > grid[0].length-1
        || visited[row][col] == true || grid[row][col] == 1) {
            return 0;
        }

        if(row == grid.length-1 && col == grid[0].length-1)
            return 1;

        visited[row][col] = true;

        int count = 0;
        count += countPath(grid, row+1, col, visited);
        count += countPath(grid, row-1, col, visited);
        count += countPath(grid, row, col+1, visited);
        count += countPath(grid, row, col-1, visited);

        visited[row][col] = false;
        return count;



        






    }
}
