package listnode;

/**
 * Created by chenwenping on 17/3/23.
 */
public class FindKthToTail {

    public ListNode findKthToTail(ListNode head,int k) {
        if (head == null || k <= 0) {
            return null;
        }

        int count = 0;
        int kTemp = k;

        ListNode frist = head;
        ListNode second = head;


        while (frist != null) {
            frist = frist.next;
            count ++;
            if (k < 1) {
                second = second.next;
            }
            k--;
        }

        if (count < kTemp) {
            return null;
        }

        return second;

    }
}
