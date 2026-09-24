class Solution {
    public int[] twoSum(int[] nums, int target) {

        HashMap<Integer, Integer> elementIndexMap = new HashMap();

        for(int i = 0; i < nums.length;i++){
            int diff = target - nums[i];
            if(elementIndexMap.containsKey(diff)){
                return new int []{elementIndexMap.get(diff), i };
            } else{
                elementIndexMap.put(nums[i], i);
            }
        }
        return new int []{-1,-1};
    }
}
