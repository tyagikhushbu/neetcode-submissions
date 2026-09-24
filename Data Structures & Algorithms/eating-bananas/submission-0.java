class Solution {
    public int minEatingSpeed(int[] piles, int h) {
        int start  = 1;
        int end = Arrays.stream(piles).max().getAsInt();
        int res = end;
        while(start <= end) {
            int mid = start + ((end-start)/2);
            
            int sum = 0;
            for(int banana: piles) {
                int val = (int) Math.ceil((double) banana/mid);
                sum+=val;
            }
            if(sum > h) {
                start = mid+1;
            } else if (sum <= h) {
                res = mid;
                end = mid-1;
            } else {
                return mid;
            }
        }
        return res;
    }
}
