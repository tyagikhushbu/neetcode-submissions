class Solution {
    public List<List<String>> groupAnagrams(String[] strs) {

        HashMap<String, List<String>> map = new HashMap();
        //iterate over each element O(n)
            //convert to char array O(k)
            //char array -> int array (using ascii value) (O(26))
            //covert that int array into a key (O(26))
                //- add in map Strting, List<String>>
                //return map.values();

        for(String s: strs){
            int [] intMapping = new int[26];
            for(char ch: s.toCharArray()){
                int index = ch - 'a';
                intMapping[index]++;  
            }

            StringBuilder sb = new StringBuilder();

            for(int i : intMapping){
                sb.append(i).append(",");
            }
            String key = sb.toString();
            if(map.containsKey(key)){
                map.get(key).add(s);
            }else {
                List<String> list = new ArrayList();
                list.add(s);
                map.put(key, list);
            }
        }
        return new ArrayList(map.values());

    }
}
