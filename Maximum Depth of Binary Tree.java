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
    public int maxDepth(TreeNode root) {
        if (root == null) return 0;
        return count(root, 0);
    }
    
    public int count(TreeNode node, int currentCount){
        if (node == null) return currentCount;
        currentCount++;
        int right = count(node.right, currentCount);
        int left = count(node.left, currentCount);
        
        return Math.max(right, left);
    }
}
