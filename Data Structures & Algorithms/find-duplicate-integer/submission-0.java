class Solution {
    public int findDuplicate(int[] nums) {
        //nums size = 5
        //n = 4 (1-4)
        //lastSeen = 1
        //duplicate

        //store teh elements as key = element, val = freq
        HashMap<Integer,Integer> freqMap = new HashMap();
        for(int num: nums){
            freqMap.put(num, freqMap.getOrDefault(num,0)+1);
        }

        for(Map.Entry<Integer,Integer> entry: freqMap.entrySet()){
            int key = entry.getKey();
            int count = entry.getValue();
            if(count > 1){
                return key;
            }
        }
        return -1;
        
    }
}
