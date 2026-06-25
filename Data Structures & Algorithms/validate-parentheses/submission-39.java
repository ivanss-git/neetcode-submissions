
class Solution {
    public boolean isValid(String s) {
        if (s == null || s.length() % 2 != 0) {
            return false;

        } 
        Map<Character, Character > clopen = new HashMap<>();
        clopen.put(')', '(');
        clopen.put(']', '[');
        clopen.put('}', '{');
        Stack<Character> stack = new Stack();

        for (char c : s.toCharArray()) {
            if (clopen.containsKey(c)) {
                if (stack.isEmpty() || stack.pop() != clopen.get(c)) {
                    return false;
                }
            } else {
                stack.push(c);
            }
        }
        return stack.isEmpty();
    }
}
