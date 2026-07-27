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
    int globalMax;

    public int postorder(TreeNode root) {
        if (root == null) { return 0;}

        int leftGain = Math.max(0, postorder(root.left));
        int rightGain = Math.max(0, postorder(root.right));

        globalMax = Math.max( globalMax, root.val + leftGain + rightGain);

        return root.val + Math.max(leftGain, rightGain);
    }

    public int maxPathSum(TreeNode root) {
        globalMax = Integer.MIN_VALUE;
        postorder(root);
        return globalMax;
    }
}
