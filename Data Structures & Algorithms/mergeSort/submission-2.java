// Definition for a pair.
// class Pair {
//     public int key;
//     public String value;
//
//     public Pair(int key, String value) {
//         this.key = key;
//         this.value = value;
//     }
// }
class Solution {
    public List<Pair> mergeSort(List<Pair> pairs) {
        if(pairs.isEmpty())
            return pairs;
        if(pairs.size() == 1) {
            return pairs;
        } 

        int mid = pairs.size()/2;

        List<Pair> left = mergeSort(pairs.subList(0, mid));
        List<Pair> right = mergeSort(pairs.subList(mid, pairs.size()));
        return merge(left,right);
    }

    public List<Pair> merge (List<Pair> left, List<Pair> right) {
        List<Pair> sortedList = new ArrayList();
        int p1 =0; int p2 = 0;
        while(p1 < left.size() && p2 < right.size()) {
            if(left.get(p1).key <= right.get(p2).key) {
                sortedList.add(left.get(p1));
                p1++;
            } else {
                sortedList.add(right.get(p2));
                p2++;
            }
        }

        if(p2 != right.size()) {
            sortedList.addAll(right.subList(p2, right.size()));
        } else if(p1 !=left.size()) {
            sortedList.addAll(left.subList(p1, left.size()));
        }
        return sortedList;
    }
}
