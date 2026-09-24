class LRUCache {
    LinkedHashMap<Integer,Integer> map = new LinkedHashMap();
    int capacity = 0;

    public LRUCache(int capacity) {
        this.capacity = capacity;
    }
    
    public int get(int key) {
        if(map.containsKey(key)) {
            int val = map.get(key);
            map.remove(key);
            map.put(key, val);
            System.out.println(val);
            return val;
        }
        return -1;
        
    }
    
    public void put(int key, int value) {
        System.out.println(map.size());
        System.out.println(this.capacity);
        if(map.containsKey(key)) {
            map.remove(key);
            map.put(key, value);
        } else {
            if(map.size() >= this.capacity) {
                Integer firstKey = map.keySet().iterator().next();
                map.remove(firstKey);
            }
            map.put(key, value);
        }
    }
}
