class Solution {
    public int maxArea(int[] heights) {
        int maxVol = Integer.MIN_VALUE;
        int left = 0;
        int right = heights.length - 1;

        while(left < right){

            int area = right-left;
            int height = Math.min(heights[left], heights[right]);
            int vol = area * height;
            maxVol = Math.max(maxVol, vol);
            System.out.println(maxVol);
            if (heights[left] < heights[right]) {
                left++;
            } else {
                right--;
            }
        }
             return maxVol;
    } 
       
}
    

