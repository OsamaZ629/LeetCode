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
    public TreeNode mergeTrees(TreeNode root1, TreeNode root2) {
        if(root1 == null && root2 == null) return null;
        else if (root1 == null) {
            root1 = new TreeNode(0);
            root1.val = root1.val + root2.val;
            root1.right = mergeTrees(root1.right, root2.right);
            root1.left = mergeTrees(root1.left, root2.left);
        }else if (root2 == null){
            root1.val = root1.val;
            root1.right = mergeTrees(root1.right, null);
            root1.left = mergeTrees(root1.left, null);
        }else{
            root1.val = root1.val + root2.val;
            root1.right = mergeTrees(root1.right, root2.right);
            root1.left = mergeTrees(root1.left, root2.left);
        }

        return root1;
    }
}
