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
    public List<List<Integer>> levelOrder(TreeNode root) {
        List<List<Integer>> list = new ArrayList<>();
        Queue<TreeNode> queue = new LinkedList<>();

        if (root == null) { return list;}

        // initialize queue to root of BT if possible
        queue.offer(root);

        while (!queue.isEmpty()) {
            int lvlSize = queue.size();
            List<Integer> sublist = new ArrayList<>();

            for (int i = 0; i < lvlSize; i++) {
                TreeNode current = queue.poll();
                sublist.add(current.val);

                if (current.left != null) { queue.offer(current.left);}
                if (current.right != null) { queue.offer(current.right);}
            }
            list.add(sublist);
        }
        return list;
    }
}
