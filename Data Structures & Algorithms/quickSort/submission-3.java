// Definition for a pair.
// class Pair {
//     int key;
//     String value;
//
//     public Pair(int key, String value) {
//         this.key = key;
//         this.value = value;
//     }
// }
class Solution {
    public List<Pair> quickSort(List<Pair> pairs) {
        if(pairs.size() == 0)
            return pairs;
        return quickSortHelper(pairs,0, pairs.size());

     }

     public List quickSortHelper(List<Pair> pairs, int start, int end) {
        
        if (end - start <= 1)
            return pairs;
        


        int j = start;
        Pair pivot = pairs.get(end-1);

        for (int i = start ;i<end -1 ;i++) {
            Pair pair = pairs.get(i);
            if(pair.key < pivot.key) {
                Pair temp = pairs.get(j);
                pairs.set(j, pairs.get(i));
                pairs.set(i,temp);
                j++; 
            }
        }

        pairs.set(end-1, pairs.get(j));
        pairs.set(j, pivot);

        quickSortHelper(pairs, start, j);
        quickSortHelper(pairs, j+1, end);
        return pairs;
     }
}
