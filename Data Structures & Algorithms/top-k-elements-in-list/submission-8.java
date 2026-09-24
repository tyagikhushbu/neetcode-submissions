class Solution {
    public int[] topKFrequent(int[] nums, int k) {

        HashMap<Integer,Integer> map = new HashMap();
        for(int num : nums){
            map.put(num, map.getOrDefault(num,0)+1);
        }

        Comparator<Map.Entry<Integer,Integer>> cmp = (a,b) -> {
            return a.getValue().compareTo(b.getValue());
        };

        PriorityQueue<Map.Entry<Integer,Integer>> pq = new PriorityQueue(cmp);
        

        for(Map.Entry<Integer,Integer> entry : map.entrySet()){
            System.out.println(pq);
             pq.offer(entry);
            if(pq.size() > k){
                pq.poll();
            }
        }
            
            

            
        

        System.out.println("Queue: "+pq);
        int [] arr = new int [pq.size()];
        int j=pq.size()-1;
        for(Map.Entry<Integer,Integer> entry : pq){
            arr[j] = entry.getKey();
            j--;
        }
        return arr;

    }
}
