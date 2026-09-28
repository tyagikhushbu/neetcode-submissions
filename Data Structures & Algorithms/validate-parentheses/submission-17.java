class Solution {
    public boolean isValid(String s) {
        Stack<Character> stack = new Stack();
        //{[]} {[}]
        if(s == null || s.length() <=1 ) return false;
        Map<Character, Character> bracesMap = Map.of(')', '(', '}', '{', ']', '[');

        for(int i = 0 ; i < s.length() ; i++){

            Character ch = s.charAt(i);
            if(!bracesMap.containsKey(ch)){
                stack.push(ch);
            } else {

                if(!stack.isEmpty()){
                    Character poppedChar = stack.pop();
                    if(poppedChar != bracesMap.get(ch)) return false;
                } else {
                    return false;
                }
            }

        }
        return stack.isEmpty();
        
    }
}
