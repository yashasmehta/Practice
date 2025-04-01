package dsa.stack;

import java.util.ArrayDeque;
import java.util.Deque;

public class ParenthesisChecker {
    public boolean check(String str) {
        Deque<Character> stack = new ArrayDeque<>();

        for(int i=0;i<str.length();i++) {
            char curr = str.charAt(i);

            if (isOpening(curr)) {
                stack.push(curr);
            } else {
                if(stack.isEmpty()) {
                    return false;
                } else if(!isMatching(stack.peek(), curr)) {
                    return false;
                } else {
                    stack.pop();
                }
            }
        }

        return stack.isEmpty();
    }

    private boolean isMatching(char a, char b) {
        return (a == '{' && b == '}') || (a == '(' && b == ')') || (a == '[' && b == ']');
    }

    private boolean isOpening(char a) {
        return a == '{' || a == '(' || a == '[' ;
    }

    public static void main(String[] args) {
        ParenthesisChecker obj = new ParenthesisChecker();
        System.out.println(obj.check("{([])}{"));
    }
}
