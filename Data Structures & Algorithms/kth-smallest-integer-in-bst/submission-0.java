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
    int result = 0;
    int count = 0;
    public int kthSmallest(TreeNode root, int k) {
        count(root, k);
        return result;
    }

    public void count(TreeNode root, int k ) {
        if(root == null){
            return;
        }
        count(root.left,k);
        count++;
        if(k == count) {
            result =  root.val;
            return;
        }
        count(root.right,k);
    }
}
