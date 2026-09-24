class Solution {
    public int[] twoSum(int[] nums, int target) {
        int [] data = new int[2];
        List<Integer> list = Arrays.stream(nums).boxed().toList();
        for (int i = 0;i < nums.length;i++) {
            int diff = target - nums[i];

            List<Integer> latest = list.subList(i+1, list.size());
            int index = latest.indexOf(diff);
            if(index == -1) {
                continue;
            }
            data[0] = i;
            data[1] =index+1+i;
        }
        return data;
        
    }
}
