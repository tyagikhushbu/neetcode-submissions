class Solution {
    public int[] topKFrequent(int[] nums, int k) {
        
        HashMap<Integer, Integer> freqMap = new HashMap<>();
        for(int num : nums){
            freqMap.put(num, freqMap.getOrDefault(num, 0)+1);
        }

        PriorityQueue<Integer> queue = new PriorityQueue<>((a, b)-> {
            return Integer.compare(freqMap.get(a), freqMap.get(b));
        });

        for(Map.Entry<Integer, Integer> map : freqMap.entrySet()){
            Integer key = map.getKey();
            Integer value = map.getValue();

            queue.offer(key);
            if(queue.size() > k){
                queue.poll();
            }
        }

        int arr [] = new int [k];
        int count = 0;
        while(!queue.isEmpty()){
            arr[count] = queue.poll();
            count++;
        }

        return arr;
    }
}
