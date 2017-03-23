package tree;

import java.util.ArrayDeque;
import java.util.Queue;

/**
 * Created by chenwenping on 17/3/23.
 */
public class TreeDepth {

    public int treeDepth(TreeNode root) {
        if (root == null) {
            return 0;
        }

       /* if (root.left == null || root.right == null) {
            return 1;
        }*/

        int leftLen = treeDepth(root.left);
        int rightLen = treeDepth(root.right);

        return leftLen > rightLen ? leftLen + 1 : rightLen + 1;
    }

    // 获取最大深度
    public static int getMaxDepth(TreeNode root) {
        if (root == null)
            return 0;
        else {
            int left = getMaxDepth(root.left);
            int right = getMaxDepth(root.right);
            return 1 + Math.max(left, right);
        }
    }

    // 获取最大宽度
    public static int getMaxWidth(TreeNode root) {
        if (root == null)
            return 0;

        Queue<TreeNode> queue = new ArrayDeque<TreeNode>();
        int maxWitdth = 1; // 最大宽度
        queue.add(root); // 入队

        while (true) {
            int len = queue.size(); // 当前层的节点个数
            if (len == 0)
                break;
            while (len > 0) {// 如果当前层，还有节点
                TreeNode t = queue.poll();
                len--;
                if (t.left != null)
                    queue.add(t.left); // 下一层节点入队
                if (t.right != null)
                    queue.add(t.right);// 下一层节点入队
            }
            maxWitdth = Math.max(maxWitdth, queue.size());
        }
        return maxWitdth;
    }


}
