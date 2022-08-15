package Easy;

import java.util.Stack;

public class Solution20 {

    public static boolean isValid(String s) {
        if (s.length() % 2 != 0)
            return false;

        Stack<Character> stack = new Stack<>();

        for (char character : s.toCharArray()) {
            if (character == '(')
                stack.push(')');
            else if (character == '{')
                stack.push('}');
            else if (character == '[')
                stack.push(']');
            else if (stack.isEmpty() || stack.pop() != character)
                return false;
        }

        return stack.isEmpty();
    }

    public static void main(String[] args) {
        System.out.println(isValid("(("));
    }
}
