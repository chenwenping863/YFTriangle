package tree;

/**
 * Created by chenwenping on 17/3/23.
 */
public class IsBalancedTree {
    private boolean result = true;
    // 获取最大深度
    public int treeDepth(TreeNode root) {
        if (root == null)
            return 0;
        else {
            int left = treeDepth(root.left);
            int right = treeDepth(root.right);
            if (Math.abs(left - right) > 1) {
                result = false;
            }

            return 1 + Math.max(left, right);
        }
    }

    public boolean isBalanced_Solution(TreeNode root) {

        if(root == null) {
            return true;
        }
        treeDepth(root);

        return result;
    }


}
