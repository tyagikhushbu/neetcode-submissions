// Definition for a pair
// class Pair {
//     int key;
//     String value;
//
//     Pair(int key, String value) {
//         this.key = key;
//         this.value = value;
//     }
// }
public class Solution {
    public List<List<Pair>> insertionSort(List<Pair> pairs) {
        List<List<Pair>> newPairs = new ArrayList();

        for(int i = 0; i < pairs.size(); i++) {
            int j = i-1;
            while(j >= 0) {

                Pair pair1 = (Pair)pairs.get(j);
                Pair pair2 = (Pair)pairs.get(j+1);
                int val1 = pair1.key;
                int val2 = pair2.key;
                if(val2 < val1 ) {
                    pairs.set(j,pair2);
                    pairs.set(j+1,pair1);
                }
                
                j--;
            }
            newPairs.add(new ArrayList<>(pairs)); 

        }
        return newPairs;

    }
}
