class Solution {
    public boolean isAnagram(String s, String t) {

        //represent s in as int array[]-> ace -> int [] = {1,0,1}
        //compare teh keys created
            //if equal -> they are anagram
            //otherwise not

        String keyS = getKey(s);
        String keyT = getKey(t);
        if(keyS.equals(keyT)){
            return true;
        } else {
            return false;
        }
        
    }

    public String getKey(String s){

        int [] arr = new int [26];

        for(char ch: s.toCharArray()){
            int index = ch-'a';
            arr[index] = arr[index]+1;
        }
        StringBuilder sb = new StringBuilder();

        for(int i : arr){
            sb.append(i).append(",");
        }    

        return sb.toString();
    }
}
