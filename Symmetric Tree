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
    public boolean isSymmetric(TreeNode root) {
        if (root == null || (root.right == null && root.left == null)) return true;
        return isSymmetric2(root.left, root.right);
    }
    public boolean isSymmetric2(TreeNode n1, TreeNode n2){
        if (n1 == null && n2 != null) return false;
        else if (n2 == null && n1 != null) return false;
        else if (n1 == null && n2 == null) return true;
        if (n1.val != n2.val) return false;
        return isSymmetric2(n1.left, n2.right) && isSymmetric2(n1.right, n2.left);
    }
}
