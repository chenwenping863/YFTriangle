package listnode;

/**
 * Created by chenwenping on 17/3/23.
 */
public class EntryNodeOfLoop {

     public class ListNode {
         public int val;
         public ListNode next;

        ListNode(int val) {
            this.val = val;
        }
    }
    public ListNode entryNodeOfLoop(ListNode pHead) {
        if (pHead == null || pHead.next == null) {
            return null;
        }

        ListNode p1 = pHead;
        ListNode p2 = pHead;

        while (p2 != null && p2.next != null) {
            p1 = p1.next;
            p2 = p2.next.next;

            if (p1 == p2) {
                p2 = pHead;
                while (p1 != p2) {
                    p1 = p1.next;
                    p2 = p2.next;
                }
                if (p1 == p2) {
                    return p1;
                }
            }

        }
    return null;

    }

}
