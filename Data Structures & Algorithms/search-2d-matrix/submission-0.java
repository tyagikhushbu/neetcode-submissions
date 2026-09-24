class Solution {
    public boolean searchMatrix(int[][] matrix, int target) {

        int rows = matrix.length;
        int cols = matrix[0].length;

        int start = 0;
        int end = (rows * cols) - 1;
        
        while(start <= end) {
            int mid = (start+end)/2;
            int row = mid /cols;
            int col = mid %cols;
            
            if(target < matrix[row][col]) {
                end = mid-1;
            } else if(target > matrix[row][col]) {
                start = mid+1;
            } else {
                return true;
            }
        }

        return false;

        
    }
}
