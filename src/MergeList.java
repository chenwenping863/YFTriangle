/**
 * Created by chenwenping on 17/3/23.
 */


public class MergeList {
    public class ListNode {
        int val;
        ListNode next = null;

        ListNode(int val) {
            this.val = val;
        }
    }

    public ListNode merge(ListNode list1,ListNode list2) {
        ListNode mergeNode = null;
        if (list1 == null) {
            return list2;
        }

        if (list2 == null) {
            return list1;
        }

        if (list1.val >= list2.val) {
            mergeNode = list2;
            mergeNode.next = merge(list1, list2.next);

        } else {
            mergeNode = list1;
            mergeNode.next = merge(list1.next, list2);
        }

        return mergeNode;

    }
}
