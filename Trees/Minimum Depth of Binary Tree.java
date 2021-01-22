class Solution {
    public int minDepth(TreeNode root) {
        if (root == null) return 0;
        if (root.left == null && root.right == null) return 1;
        int left = Integer.MAX_VALUE, right = Integer.MAX_VALUE;
        if (root.left != null) left = minDepth(root.left);
        if (root.right != null) right = minDepth(root.right);
        return 1 + Math.min(left, right);
    }
}