package listnode;

import java.util.Stack;

/**
 * Created by chenwenping on 17/3/22.
 */
public class StackImplList {
    Stack<Integer> stack1 = new Stack<Integer>();
    Stack<Integer> stack2 = new Stack<Integer>();

    public void push(int node) {
        stack1.push(node);

    }

    public int pop() throws Exception{
        if (stack1.empty() && stack2.empty()) {
            throw new Exception("Queue");
        }

        if (stack2.empty()) {
            while (!stack1.empty()) {
                stack2.push(stack1.pop());
            }
        }

        return stack2.pop();

    }
}
