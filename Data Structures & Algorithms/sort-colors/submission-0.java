class Solution {
    public void sortColors(int[] nums) {
        System.out.println("Nums: "+nums);
        int max = Arrays.stream(nums).max().getAsInt();
        System.out.println("max: "+max);
        int counts [] = new int [max+1];
        System.out.println("length: "+counts.length);        
        for (int num: nums) {
            counts[num]++;
        }
        
        int n = 0;
        for(int j =0;j< counts.length; j++) {
            for(int k = 0; k < counts[j]; k++) {
                nums[n]= j;
                n++;
            }
        }
        
    }
}