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
    private int preorderIndex = 0;
    private Map<Integer, Integer> inorderMap = new HashMap<>();

    private TreeNode arrayToTree(int[] preorder, int left, int right) {

        // base case: if there are no elements to construct the tree
        if (left > right) { return null;}

        // the first element in preorder is always the root
        int rootValue = preorder[preorderIndex++];
        TreeNode root = new TreeNode(rootValue);

        // find where the split occurs
        int inorderIndex = inorderMap.get(rootValue);

        // recursively build left and right subtrees
        root.left = arrayToTree(preorder, left, inorderIndex - 1);
        root.right = arrayToTree(preorder, inorderIndex + 1, right);

        return root;

    }

    public TreeNode buildTree(int[] preorder, int[] inorder) {

        for (int i = 0; i < inorder.length; i++) {
            inorderMap.put(inorder[i], i);
        }

        return arrayToTree(preorder, 0, inorder.length -1);
    }
}
