class Solution {

    /*
        input : []
        output : []

            1,2,4,6

        ->  48, 24, 12, 8
         -1,0,1,2,3 -> 

          -1,0,1,2,3.0,    0.  | -6 | count of 1;
        -> 0, 0, 0,0, 0 count

    */
    public int[] productExceptSelf(int[] nums) {
        int [] result = new int [nums.length];
        int product = 1;
        int productWithoutZeroes = 1;
        int zeros = 0;
        for(int i = 0; i < nums.length; i++ ){
            if(nums[i] == 0){
                zeros++;
            } else {
                productWithoutZeroes = productWithoutZeroes * nums[i];
            }
            product = product * nums[i];
        }

        for(int j = 0; j< nums.length ; j++){

            if(zeros == 1 && nums[j] == 0){
                result[j] = productWithoutZeroes;
            } else if(zeros > 1){
                result[j] = 0;
            } else {
                result[j] = product/nums[j];
             }
             
        }
        return result;
    }
}  
