class Solution {
    public boolean isValidBST(TreeNode root) {
        return helper(root, Long.MIN_VALUE, Long.MAX_VALUE);
    }

    public boolean helper(TreeNode node, long mini, long maxi) {
        if (node == null) return true;
        if (node.val <= mini || node.val >= maxi) return false; // strict check
        return helper(node.left, mini, node.val) && helper(node.right, node.val, maxi);
    }
}
