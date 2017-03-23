package listnode;

import java.util.Stack;

/**
 * Created by chenwenping on 17/3/23.
 */
public class IsPalindrome {
    public boolean isPalindrome(ListNode pHead) {
        ListNode fast = pHead;
        ListNode slow = pHead;
        Stack<Integer> stack = new Stack<Integer>();
        /**
         * 将链表的前半部分元素装入栈中，当快速runner
         *（移动的速度是慢速runner的两倍）
         * 到底链表尾部时，则慢速runner已经处于链表中间位置
         */
        while(fast != null && fast.next != null){
            stack.push(slow.val);
            slow = slow.next;
            fast = fast.next.next;
        }
        //当链表为奇数个时，跳过中间元素
        if (fast != null) {
            slow = slow.next;
        }
        while(slow != null){
            //如果两者不相同，则该链表不是回文串
            if (stack.pop() != slow.val) {
                return false;
            }
            slow = slow.next;
        }
        return true;
    }
}
