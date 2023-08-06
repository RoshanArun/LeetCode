class Solution {
    public boolean isValid(String s) {
        if (s.length() % 2 != 0) {
            return false;
        }

        Stack<Character> stack = new Stack();
        char[] str = s.toCharArray();

        for (int i = 0; i < s.length(); i++) {
            if (str[i] == '(' || str[i] == '{' || str[i] == '[') {
                stack.push(str[i]);
            } else if (str[i] == ')' && !stack.isEmpty() && stack.peek() == '(') {
                stack.pop();
            } else if (str[i] == ']' && !stack.isEmpty() && stack.peek() == '[') {
                stack.pop();
            } else if (str[i] == '}' && !stack.isEmpty() && stack.peek() == '{') {
                stack.pop();
            } else {
                stack.push(str[i]);
            }
        }
        return stack.isEmpty();
    }
}
