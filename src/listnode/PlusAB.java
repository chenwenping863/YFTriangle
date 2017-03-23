package listnode;

/**
 * Created by chenwenping on 17/3/23.
 */
public class PlusAB {
    public ListNode plusAB(ListNode a, ListNode b) {
        // write code here
        ListNode resultHead = new ListNode(-1);
        ListNode resultCurrent = resultHead;
        int addToNextDigit = 0;
        while (a != null || b != null || addToNextDigit != 0) {
            int aVal = a != null ? a.val : 0;
            int bVal = b != null ? b.val : 0;

            int sum = aVal + bVal + addToNextDigit;
            int nodeDigit = sum % 10;
            addToNextDigit = sum / 10;

            resultCurrent.next = new ListNode(nodeDigit);
            resultCurrent = resultCurrent.next;

            a = a != null ? a.next : null;
            b = b != null ? b.next : null;
        }
        return resultHead.next;
    }
}
