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

 // Is this exact current node the root of a tree that is identical to subRoot?
 // If not, is subRoot located somewhere further down in my left subtree or my right subtree?

class Solution {  

    public boolean isSameTree(TreeNode s, TreeNode t) {
        if (s == null && t == null) { return true;}
        if (s == null || t == null || s.val != t.val) { return false;}
        return (s.val == t.val) && isSameTree(s.left, t.left) && isSameTree(s.right, t.right);
    }
    public boolean isSubtree(TreeNode root, TreeNode subRoot) {
        if (root == null) { return false;}
        if (isSameTree(root, subRoot)) { return true;}
        return isSubtree(root.left, subRoot) || isSubtree(root.right, subRoot);
    }
}
