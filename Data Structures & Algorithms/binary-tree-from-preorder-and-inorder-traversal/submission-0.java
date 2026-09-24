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

    public TreeNode buildTree(int[] preorder, int[] inorder) {

        if((preorder == null || preorder.length == 0) ||  (inorder == null || inorder.length == 0)) {
            return null;
        }
        //This is the root node of preorder
        TreeNode root = new TreeNode(preorder[0]);
        //find the root node index in inorder
        int midIndex = -1;
        for (int i = 0; i < inorder.length; i++) {
            if (inorder[i] == preorder[0]) {
                midIndex = i;
                break;
            }
        }

        //root.left will build left side -> preoder-> with left elembts
        root.left = buildTree(Arrays.copyOfRange(preorder,1, midIndex+1), Arrays.copyOfRange(inorder, 0, midIndex));
         //root.right will build left side -> preoder-> with right elembts
        root.right = buildTree(Arrays.copyOfRange(preorder, midIndex+1, preorder.length), Arrays.copyOfRange(inorder, midIndex+1, inorder.length));
        return root;



       
    }
}
