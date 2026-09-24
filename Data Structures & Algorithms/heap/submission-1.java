class MinHeap {
    private List<Integer> heap = null;
    
    public MinHeap() {
        heap = new ArrayList();
        heap.add(-1);
    }

    public void push(int val) {
        heap.add(val);
        int index = heap.size()-1;
        while(index > 1 && heap.get(index/2) > heap.get(index)) {
            swap(index/2, index);
            index = index/2;
        }
    }

    public Integer pop() {

        if(heap.size() <=1) {
            return -1;
        }

        if(heap.size() == 2) {
            return heap.remove(1);
        }

        int lastElement = heap.get(heap.size()-1);
        int poppedElement = heap.get(1);
        heap.set(1, lastElement);
        heap.remove(heap.size()-1);
        
        int i = 1;
        int leftChild = i * 2;
        while(leftChild < heap.size()) {
            if(leftChild+1 < heap.size() && heap.get(leftChild+1) < heap.get(leftChild) &&
                heap.get(leftChild+1) < heap.get(i)) {
                    swap(i, leftChild+1);
                } else if (heap.get(leftChild) < heap.get(i)) {
                    swap(i, leftChild);
                }
                else break;
        }
        return poppedElement;
    }

    public void swap(int i , int j) {
        int temp = heap.get(i);
        heap.set(i,heap.get(j));
        heap.set(j, temp);
    }

    public Integer top() {
        if(heap.size() ==1) {
            return -1;
        }

        return heap.get(1);
    }

    public void heapify(List<Integer> num) {

        this.heap = new ArrayList();
        this.heap.add(-1);
        this.heap.addAll(num);
        
        int size = this.heap.size()-1;
        int curr = size/2; 

        while(curr > 0) {
            int i = curr;
            System.out.println(i);

            while(i*2 < this.heap.size()) {
                if((i*2)+1 < this.heap.size() && this.heap.get((i*2)+1) < heap.get(i*2) &&
                heap.get((i*2)+1) < heap.get(i)) {
                    swap(i, (i*2)+1);
                    i = (i*2)+1;
                } else if (this.heap.get(i*2) < this.heap.get(i)) {
                    swap(i, i*2);
                    i = 2 * i;
                }
                else break;
            }
            curr--;
        }
    }
}
