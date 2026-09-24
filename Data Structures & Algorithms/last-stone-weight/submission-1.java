class Solution {
    public int lastStoneWeight(int[] stones) {

        PriorityQueue<Integer> minHeap = new PriorityQueue<>();
        for (int i : stones) {
            minHeap.offer(-i);
        }

        while(minHeap.size() > 1) {
            int i = minHeap.poll();
            int j = minHeap.poll();
            if(j > i) {//. -3,-2,-2
                int diff = i-j;
                minHeap.offer(diff);
            }
        }

        int data = minHeap.isEmpty() ? 0 : -minHeap.peek();
        return data;
    }

    public int getLastStoneWeight(List<Integer> stonesList) {

        if(stonesList.size() == 0)
            return 0;
        if(stonesList.size() == 1)
            return stonesList.get(0);

        Collections.sort(stonesList, Collections.reverseOrder());
        
        int x = stonesList.get(0);
        int y = stonesList.get(1);
        if(x == y) {
            return getLastStoneWeight(stonesList.subList(2,stonesList.size()));
        } else {
            int diff = Math.abs(x-y);
            stonesList.set(1,diff);
            return getLastStoneWeight(stonesList.subList(1,stonesList.size()));
        }

    }


}
