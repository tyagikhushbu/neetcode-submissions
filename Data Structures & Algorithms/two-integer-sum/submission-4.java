class Solution {
    public int[] twoSum(int[] nums, int target) {

        //iteratior through each element,(O(n))
            //calculate the diff
            //chck if teh diff in hashmap (O(n)
                //if yes, we have foudn teh value, extract the index  and the create array and send
                //else put the value in teh hashmap, index of the elemnt
        
            //TC-> O(n)
            //SC-> O(n)
        HashMap<Integer, Integer> map = new HashMap();

        int [] result= new int[]{-1,-1};

        for(int i =0;i<nums.length;i++){
            int diff = target - nums[i];
            if(map.containsKey(diff)){
                result[0] = map.get(diff);
                result[1] = i;
            } else {
                map.put(nums[i],i);
            }
        }
        return result;
    }
}
