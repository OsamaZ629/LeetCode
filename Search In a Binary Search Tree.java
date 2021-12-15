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
    public TreeNode searchBST(TreeNode node, int val) {
        return searchBST2(node, val);
    }
    public TreeNode searchBST2(TreeNode node, int val) {
        if (node == null) return null;
        if (node.val == val) return node;
        TreeNode r = searchBST2(node.right, val);
        TreeNode l = searchBST2(node.left, val);
        if (l != null) return l;
        return r;
        
    }
}
