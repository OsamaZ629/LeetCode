/**
 * Definition for a binary tree node.
 * public class TreeNode {
 *     int val;
 *     TreeNode left;
 *     TreeNode right;
 *     TreeNode() {}
 *     TreeNode(int val) { this.val = val; }
 *     TreeNode(int val, TreeNode left, TreeNode right) {
 *         this.val = val;
 *         this.left = left;
 *         this.right = right;
 *     }
 * }
 */
class Solution {
    public boolean hasPathSum(TreeNode root, int targetSum) {
        if (root == null) return false;
        return hasPathSum(root, 0, targetSum);
    }
        public boolean hasPathSum(TreeNode node, int current, int targetSum) {
            if (node == null) return false;
            current+=node.val;
            if (node.left == null && node.right == null && current == targetSum) return true;
            boolean left = hasPathSum(node.left, current, targetSum);
            boolean right = hasPathSum(node.right, current, targetSum);
            return left || right;
    }
}
