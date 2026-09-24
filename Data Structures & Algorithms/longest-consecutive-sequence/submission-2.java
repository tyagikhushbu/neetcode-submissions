class Solution {
    
    HashMap<Integer, Integer> map = new HashMap();
    public int longestConsecutive(int[] nums) {

        int max = Integer.MIN_VALUE;
        int count = 0;

        for(int num: nums){
            map.put(num, map.getOrDefault(num,0)+1);
        }

        for(int i = 0;i<nums.length;i++){
            int val = nums[i];
            if(!map.containsKey(val-1)){
                int length = getCount(val, 1);
                max = Math.max(max, length);
            }

        }
        if(max == Integer.MIN_VALUE){
            max= 0;
        }
        return max;
    }

    public int getCount(int val, int count){
         while(map.containsKey(++val) ){
            System.out.println(val);
            ++count;
            if(map.get(val)== 1){
                map.remove(val);
            } else {
                map.put(val, map.get(val)-1);
            }
         }
         return count;
                
    }

}
