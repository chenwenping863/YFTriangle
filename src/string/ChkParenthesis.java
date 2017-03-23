package string;

import java.util.Stack;

/**
 * Created by chenwenping on 17/3/23.
 */
public class ChkParenthesis {

    public boolean chkParenthesis(String A, int n) {
        // write code here
        Stack<Character> stack = new Stack<>();
        char[] charA = A.toCharArray();
        for (char c : charA) {
            if (c == '(') {
                stack.push(c);
            } else if (c == ')' && !stack.empty()) {
                stack.pop();
            } else {
                return false;
            }
        }

        if (stack.empty()) {
            return true;
        }
        return false;
    }

}
