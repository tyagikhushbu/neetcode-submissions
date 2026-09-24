class Solution {
    public int lastStoneWeight(int[] stones) {

        List<Integer> stonesList = Arrays.stream(stones).boxed().collect(Collectors.toList());

        return getLastStoneWeight(stonesList);
        
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
