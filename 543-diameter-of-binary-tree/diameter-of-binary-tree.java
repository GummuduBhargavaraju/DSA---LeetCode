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
    int diameter;
    public int diameterOfBinaryTree(TreeNode root) {
        diameter = 0;
        dfs(root);
        return diameter;
    }
    private int dfs(TreeNode node)
    {
        if(node == null)
        {
            return 0;
        }
        int leftPath = dfs(node.left);
        int rightPath = dfs(node.right);
        diameter = Math.max(diameter , leftPath + rightPath);
        return 1+ Math.max(leftPath , rightPath);
    }
}