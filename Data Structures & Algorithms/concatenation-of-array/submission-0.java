class Solution {
    public int[] getConcatenation(int[] nums) {
        //create ans of 2*n size
        //0,1,2,3 | 4,5,6,7
        int n = nums.length;
        int ans [] = new int[2 * n];
        for(int i = 0; i < n; i++){
            int j = i + n;
            ans[i] = nums[i];
            ans[j] = nums[i];
        }
        return ans;
    }
}