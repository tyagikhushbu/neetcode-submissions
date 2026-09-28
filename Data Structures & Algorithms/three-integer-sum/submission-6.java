class Solution {
    List<List<Integer>> res = new ArrayList<>();
    public List<List<Integer>> threeSum(int[] nums) {
     
     Arrays.sort(nums);
     System.out.println(Arrays.toString(nums));

     for(int i = 0; i < nums.length-1; i++){
        if(i > 0 && nums[i] == nums[i -1]) continue;
        find2Sum(i, nums);
     }
     return res;

    }


    public void find2Sum(int index1 , int [] nums){

        int left = index1+1;
        int right = nums.length-1;
        List<Integer> result = new ArrayList<>();
        while(left < right){
            int total = nums[index1] + nums[left] + nums[right];
            if(total < 0){
                left++;
            } else if(total > 0 ){
                right--;
            } else {
                result.add(nums[index1]);
                result.add(nums[left]);
                result.add(nums[right]);
                res.add(new ArrayList(result));
                result.clear();
                left++;
                right--;
               while (left < right && nums[left] == nums[left - 1]) left++;

                

            }

        }

    }
}
