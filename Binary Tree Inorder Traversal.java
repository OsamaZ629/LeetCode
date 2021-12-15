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
    public List<Integer> inorderTraversal(TreeNode root) {
        if (root == null) return new ArrayList<Integer>();
        List<Integer> lst = new ArrayList<Integer>();
        recur(root, lst);
        return lst;
    }
    public void recur(TreeNode node, List<Integer> lst){
        if (node.left != null){
            recur(node.left, lst);
        }
        lst.add(node.val);
        if (node.right != null){
            recur(node.right, lst);
        }
    }
}
