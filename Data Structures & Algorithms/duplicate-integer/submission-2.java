class Solution {
    public boolean hasDuplicate(int[] nums) {
        //[] - false

        HashMap<Integer, Integer> map = new HashMap();

        for(int num : nums){
            map.put(num, map.getOrDefault(num,0)+1);
        }

        Collection<Integer> values = map.values();
        for(int i:values){
            if(i> 1){
                return true;
            }
        }
        return false;

    }
}