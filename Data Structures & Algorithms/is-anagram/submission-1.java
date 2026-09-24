class Solution {
    public boolean isAnagram(String s, String t) {

        //diff length falses,t -> return false

        //represent s as int array[26]
        //convert  to string 
        //then compare if equal
        //TC(O(max(s+t)))

        if(s.length() != t.length())return false;

        String newS = getString(s);
        String newT = getString(t);
        return newS.equals(newT);
    }

    public String getString(String s){

        int arr [] = new int [26];

        for(int i = 0; i < s.length(); i++){
            char ch = s.charAt(i);
            arr[ch-'a'] = arr[ch-'a']+1;
        }
        StringBuilder sb = new StringBuilder();
        for(int a : arr){
            sb.append(a).append(",");
        }
        return sb.toString();
    }
}
