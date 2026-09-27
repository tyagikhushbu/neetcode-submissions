class Solution {

    /*
        "hello" -> "string of 26 characters with ,%"

        "123*1*2*aa"
    */

    public String encode(List<String> strs) {
        if(strs.size() == 0) return "";
        StringBuilder encoded = new StringBuilder();
        encoded.append(strs.size());
        
        for(String str : strs){
            encoded.append("*").append(str.length()).append("*");
            for(int i = 0; i < str.length(); i++){
                encoded.append(str.charAt(i));
            }
            
            
        }
        System.out.println(encoded.toString());
        return encoded.toString();
    }

    public List<String> decode(String str) {
        
        List<String> result = new ArrayList<>();
        // "123*1*a*2*aa"
        if(str == null || str.length() == 0) {
            System.out.println(str);
            return result;
        }
        int index = str.indexOf("*");
        int listSize = Integer.valueOf(str.substring(0, index));
        
        int i = index+1; 
    

        for(int j = i;j< str.length(); j++){
            if(str.charAt(j) == '*'){
                String len = str.substring(i, j);
                i = j+1;
                j = i+ Integer.valueOf(len);
                String word = str.substring(i ,j);
                result.add(word);
                i = j+1;
            }
        }
        return result;
        
    }



}
