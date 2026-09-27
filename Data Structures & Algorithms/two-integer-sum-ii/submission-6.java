class Solution {
    public int[] twoSum(int[] numbers, int target) {
        //1, 2,3  5 ,6 -> 4

        int left = 0;
        int right = numbers.length-1;

        while(left < right) {
            int total = numbers[left]+ numbers[right];

            if(total > target){
                right--;
            } else if(total < target){
                left++;
            } else {
                System.out.println(left +"::"+right);
                return new int []{left+1, right+1};
            }  
        }
        return new int []{-1,-1};
        
    }
}
