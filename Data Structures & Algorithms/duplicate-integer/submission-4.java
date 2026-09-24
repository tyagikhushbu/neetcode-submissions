class Solution {
    public boolean hasDuplicate(int[] nums) {
        Set<Integer> set = new HashSet<>();

        if(nums.length == 0 || nums.length == 1) return false;

        for(int num : nums){
            if(set.contains(num)) return true;
            set.add(num);
        }
        return false;
    }
}