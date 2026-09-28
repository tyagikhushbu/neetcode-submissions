class Solution {
    public int lengthOfLongestSubstring(String s) {
        //
        if(s == null || s.length() == 0) return 0;
        int left = 0;
        int maxLength = Integer.MIN_VALUE;
        Set<Character> seen = new HashSet<>();
        for(int right = 0; right < s.length(); right++) {
            char ch = s.charAt(right);

            while(seen.contains(ch)){
                seen.remove(s.charAt(left));
                left++;
            }

            seen.add(ch);
            maxLength = Math.max(maxLength, right-left+1);
        }
        return maxLength;
    }
}
