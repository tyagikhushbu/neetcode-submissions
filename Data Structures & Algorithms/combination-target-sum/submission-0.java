class Solution {
    public List<List<Integer>> combinationSum(int[] nums, int target) {
        
        List<List<Integer>> result = new ArrayList();
        List<Integer> subList = new ArrayList();

        getAllList(nums, 0, target, result, subList );
        return result;
    }

    public void getAllList(int [] nums, int i , int target, List<List<Integer>> result, List<Integer> subList) {

        if(target == 0){
            result.add(new ArrayList(subList));
            return;
        }

        if(i == nums.length || target < 0) 
            return;

        subList.add(nums[i]);
        getAllList(nums, i, target - nums[i], result, subList);

        subList.remove(subList.size()-1);
        getAllList(nums, i+1, target, result, subList);
        

    }
}
