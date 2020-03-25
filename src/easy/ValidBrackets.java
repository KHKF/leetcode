package easy;

import java.util.HashMap;
import java.util.Stack;

public class ValidBrackets {
    static final HashMap<Character, Character> bracketMaps = new HashMap<Character, Character>() {
        {
            put('(', ')');
            put('[', ']');
            put('{', '}');
        }
    };
    public boolean isValid(String string) {
        Stack<Character> stack = new Stack<>();
        for (int i = 0; i < string.length(); i++) {
            char currentChar = string.charAt(i);
            if (bracketMaps.containsKey(currentChar)) {
                stack.push(currentChar);
            } else if (stack.isEmpty() || currentChar != bracketMaps.get(stack.pop())) {
                return false;
            }
        }
        return stack.isEmpty();
    }
}
