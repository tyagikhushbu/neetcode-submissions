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
    public List<Integer> rightSideView(TreeNode root) {

        Queue<TreeNode> q = new LinkedList<>();
        List<Integer> result = new ArrayList<>();
        int level = 0;

        if (root == null) {
            return result;
        } else 
            q.add(root);
            
        System.out.print(q);

        while(q.size() != 0) {
            int size = q.size();
            for (int i =0;i< size; i++) {
                TreeNode node = q.remove();
                if(i != 0) {
                    result.set(level, node.val);
                } else {
                    result.add(node.val);
                }
                if(node.left != null)
                    q.add(node.left);
                if(node.right != null)
                    q.add(node.right);
            }
            level++;
        }
        return result;
    }
}
