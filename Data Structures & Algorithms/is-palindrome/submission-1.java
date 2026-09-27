class Solution {
    public boolean isPalindrome(String s) {
        
        int left = 0;
        int right = s.length()-1;
        while(left < right) {
            Character charAtLeft = Character.toLowerCase(s.charAt(left));
            Character charAtRight = Character.toLowerCase(s.charAt(right));
            
            if(!Character.isLetterOrDigit(charAtLeft)){
                left++;
            }else if(!Character.isLetterOrDigit(charAtRight)){
                right--;
            } else if (charAtLeft == charAtRight){
                left++;
                right--;
            } else {
                return false;
            }
        }
        return true;
    }
}
