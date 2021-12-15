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
    public List<Integer> preorderTraversal(TreeNode root) {
        if(root == null) return new ArrayList<Integer>(0);
        List<Integer> lst = new ArrayList<Integer>();
        Stack<TreeNode> stack = new Stack<TreeNode>();
        TreeNode tmp = root;
        while(true){
            if(tmp != null){
                if (tmp.right != null) stack.push(tmp.right);
                lst.add(tmp.val);
                tmp = tmp.left;
            }else{
                if (stack.isEmpty()) break;
                tmp = stack.pop();
            }
        }
        return lst;
    }
}
