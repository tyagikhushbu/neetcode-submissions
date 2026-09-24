class Solution {
    public int removeElement(int[] nums, int val) {
    /*
    // add to a new list
    // add back
    */
    List<Integer> data = new ArrayList();
    
    for (int num: nums) {
        if(num != val) {
            data.add(num);
        }
    }

    int i = 0;
    for (int value: data) {
        nums[i++] = value;
    }
    return data.size();
    }
}