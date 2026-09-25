class Solution {

    
    public List<List<String>> groupAnagrams(String[] strs) {
        HashMap<String, List<String>>  anagramMap = new HashMap<>();

        for(String str : strs){
            int [] charMappingArray = new int[26];
            for(int i = 0; i < str.length();i++){
                Character ch = str.charAt(i);
                charMappingArray[ch-'a'] +=1;
            }

            StringBuilder sb = new StringBuilder();
            for(int c : charMappingArray){
                sb.append(c).append(',');
            }

            List<String> anagrams;
            if(!anagramMap.containsKey(sb.toString())){
               anagrams = new ArrayList();
            } else {
                anagrams = anagramMap.get(sb.toString());
            }
            anagrams.add(str);
            anagramMap.put(sb.toString(), anagrams);

        }
        return new ArrayList(anagramMap.values());
    }


}
