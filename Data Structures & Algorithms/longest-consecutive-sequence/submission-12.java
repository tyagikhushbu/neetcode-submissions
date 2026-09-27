class Solution {
    public int longestConsecutive(int[] nums) {

        if(nums.length == 0) return 0;
        int maxLength = Integer.MIN_VALUE;
        //store a freq map 

        //iteratate for each chck +1 exsists and calcualte max length

        Set<Integer> set = new HashSet<>();
        for(int num : nums){
            set.add(num);
        }
        int length = 0;

        for(int key : set){
            int val = key;
            if(set.contains(val-1)){
                continue;
            }
            while(set.contains(val)){
                length += 1;
                val = val+1;
            }
            maxLength = Math.max(length, maxLength);
            length = 0;
        }
        return maxLength;
        
    }
}
