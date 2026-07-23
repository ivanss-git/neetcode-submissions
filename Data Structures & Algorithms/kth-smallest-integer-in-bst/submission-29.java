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

 // reminder:
 // if having to find specific node, ret -1
 // if having to keep count or find total, ret 0

class Solution {

    private int count = 0;
    private int result = -1;

    public void traverse(TreeNode root, int k) {

        if (root == null) { return;}

        traverse(root.left, k);
        count++;

        // tree is already in order, so traversal count begins at leftmost non-null node
        // Therefore, if count == k, that is guaranteed to be the kth smallest value
        if (count == k) {
            result = root.val;
            return;
        }

        // repeat for the right side
        traverse(root.right, k);
    }
    public int kthSmallest(TreeNode root, int k) {
        traverse(root, k);
        return result;
    }
}
