package codingProblems.stack;

import java.util.HashMap;
import java.util.List;
import java.util.Map;
import java.util.Stack;

public class validParenthesis {
    public static void main(String[] args) {
        System.out.println(isValid("[]"));
        System.out.println(isValid("([{}])"));
        System.out.println(isValid("[(])"));
        System.out.println(isValid("["));
    }

    public static Boolean isValid(String s) {
        
        Stack<String> stack = new Stack<>();
        Map<String, String> map = Map.of("(", ")", "{", "}", "[", "]");
        
        for(char c : s.toCharArray()) {
            String curr = String.valueOf(c);
            if (map.containsKey(curr)) {
                stack.push(curr);
            } else {
                if (stack.isEmpty()) return false;
                String popped = stack.pop();
                if(!curr.equals(map.get(popped))) {
                    return false;
                }
            }
  
        }
        if (!stack.isEmpty()) return false;
        return true;
    }
}
