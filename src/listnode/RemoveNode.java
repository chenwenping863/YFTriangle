package listnode;

/**
 * Created by chenwenping on 17/3/23.
 */
public class RemoveNode {

    public boolean removeNode(ListNode pNode) {
        // write code here

        if(pNode.next==null) {
            return false;

        }

        pNode.val=pNode.next.val;
        pNode.next=pNode.next.next;
        return true;
    }
}
