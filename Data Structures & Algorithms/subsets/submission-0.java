class Solution {
    public List<List<Integer>> subsets(int[] nums) {
        List<List<Integer>> finalList = new ArrayList();
        List<Integer> subList = new ArrayList();
        getSubsets(nums, 0, finalList, subList );
        return finalList;
    }


    public void getSubsets(int[] nums, int i , List<List<Integer>> finalList, List<Integer> subList ) { 

    if(i >= nums.length) {
        finalList.add(new ArrayList(subList));
        return;
    }

    //include
    subList.add(nums[i]);
    getSubsets(nums, i+1, finalList, subList);

    subList.remove(subList.size()-1);
    getSubsets(nums, i+1, finalList, subList);
    }
        

}
