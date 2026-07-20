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
    public TreeNode lowestCommonAncestor(TreeNode root, TreeNode p, TreeNode q) {
        // cannot compare custom node objects directly
        if (root == null) { return null;}
        if (p == q) { return p;}
        if (p.val < root.val && q.val < root.val) { return lowestCommonAncestor(root.left, p, q);}
        if (p.val > root.val && q.val > root.val) { return lowestCommonAncestor(root.right, p , q);}

        return root;
                
    }
}
