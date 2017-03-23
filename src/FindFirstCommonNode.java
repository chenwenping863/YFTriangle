import java.util.HashMap;

/**
 * Created by chenwenping on 17/3/23.
 */
public class FindFirstCommonNode {

    public class ListNode {
        int val;
        ListNode next = null;

        ListNode(int val) {
            this.val = val;
        }
    }
    public ListNode findFirstCommonNode(ListNode pHead1, ListNode pHead2) {
        if (pHead1 == null || pHead2 == null) {
            return null;
        }

        HashMap<ListNode, Integer> map = new HashMap<>();

        while(pHead1 != null) {
            map.put(pHead1, null);
            pHead1 = pHead1.next;
        }

        while (pHead2 != null) {
            if (map.containsKey(pHead2)) {
                return pHead2;
            }

            pHead2 = pHead2.next;
        }

        return null;
    }

    public ListNode findFirstCommonNode1(ListNode pHead1, ListNode pHead2) {
        if (pHead1 == null || pHead2 == null) {
            return null;
        }

        int len1 = getLength(pHead1);
        int len2 = getLength(pHead2);
        int len = 0;

        if (len1 > len2) {
            len = len1 - len2;
            while(len > 0) {
                len --;
                pHead1 = pHead1.next;
            }
        }


        if (len1 < len2) {
            len = len2 - len1;
            while (len > 0) {
                len --;
                pHead2 = pHead2.next;
            }
        }

        while (pHead1 != pHead2) {
            pHead1 = pHead1.next;
            pHead2 = pHead2.next;
        }

        return pHead1;
    }

    private int getLength(ListNode node) {
        int length = 0;
        while (node != null) {
            length ++;
            node = node.next;
        }

        return length;

    }
}
