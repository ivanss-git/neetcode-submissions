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
    public int globalMax = Integer.MIN_VALUE;

    public int postorder(TreeNode root) {
        if (root == null) { return 0;}

        int leftGain = postorder(root.left);
        leftGain = Math.max(0, leftGain);

        int rightGain = postorder(root.right);
        rightGain = Math.max(0, rightGain);

        globalMax = Math.max(globalMax, leftGain + rightGain + root.val);

        return root.val + Math.max(leftGain, rightGain);
    }

    public int maxPathSum(TreeNode root) {
        if (root == null) { return -1;}

        postorder(root);
        return globalMax;
    }
}
