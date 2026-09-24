class KthLargest {
    int k;
    List<Integer> arr;
    public KthLargest(int k, int[] nums) {
        this.k = k;
        arr = Arrays.stream(nums).boxed().collect(Collectors.toCollection(ArrayList::new));
    }
    
    public int add(int val) {

        arr.add(val);
        Collections.sort(arr);//123456.  [3,6]
        
        return arr.get(arr.size()- k);
        
        
    }
}
