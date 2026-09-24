class Solution {
    public int findKthLargest(int[] nums, int k) {

        PriorityQueue<Integer>  minHeap = new PriorityQueue<>();
        for(int a : nums) {
            minHeap.offer(a);
            if(minHeap.size() > k) {
                minHeap.poll();
            }
        }
        return minHeap.peek();
        
    }
}
