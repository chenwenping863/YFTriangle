import java.util.ArrayList;
import java.util.Stack;

/**
 * Created by chenwenping on 17/3/22.
 */
public class PrintListFromTailToHead {
    public class ListNode {
       int val;
        ListNode next = null;

                ListNode(int val) {
            this.val = val;
        }
    }
    //d
    public ArrayList<Integer> printList(ListNode listNode) {
        ArrayList<Integer> list = new ArrayList<Integer>();

        while(listNode != null) {
            list.add(listNode.val);
            listNode = listNode.next;
        }

        return list;

    }


    ArrayList<Integer> list = new ArrayList<Integer>();

    public ArrayList<Integer> printListFromTailToHead(ListNode listNode) {

        while(listNode != null) {
            list.add(listNode.val);
            this.printListFromTailToHead(listNode.next);
        }

        return list;

    }

    public ArrayList<Integer> printListFromTailToHeadStack(ListNode listNode) {
        Stack<Integer> stack=new Stack<Integer>();


        while(listNode != null) {
            stack.push(listNode.val);
            listNode = listNode.next;
        }
        ArrayList<Integer> list = new ArrayList<Integer>();

        while(!stack.empty()) {
            list.add(stack.pop());
        }

        return list;

    }
}
