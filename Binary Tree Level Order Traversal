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
    public List<List<Integer>> levelOrder(TreeNode root) {
        if (root == null) return new ArrayList<List<Integer>>();
        Queue<TreeNode> qu = new LinkedList<>();
        qu.offer(root);
        List<List<Integer>> res = new ArrayList<>();
        
        while(!qu.isEmpty()){
            int sz = qu.size();
            
            List<Integer> arr = new ArrayList<>(2);
            for(int i = 0; i < sz; i++){
                if (qu.peek().left != null) qu.offer(qu.peek().left);
                if (qu.peek().right != null) qu.offer(qu.peek().right);
                arr.add(qu.poll().val);
            }
            res.add(arr);
        }
        return res;
    }
}
