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

public class Codec {

    public String serialize(TreeNode root) {
        StringBuilder sb = new StringBuilder();
        serializeHelper(root, sb);
        return sb.toString();           
        }

    public void serializeHelper(TreeNode root, StringBuilder sb) {
        if (root == null) { sb.append("#,"); return;}
        sb.append(root.val).append(",");

        serializeHelper(root.left, sb);
        serializeHelper(root.right, sb);
    }

    public TreeNode deserialize(String data) {
        if (data == null) { return null;}
        if (data.valueOf(0) == "#") { return null;}

        String[] tokens = data.split(",");
        Queue<String> queue = new LinkedList<>(Arrays.asList(tokens));

        return deserializeHelper(queue);
    }

    public TreeNode deserializeHelper(Queue<String> queue) {
        String currentToken = queue.poll();

        if (currentToken == null || currentToken.equals("#")) {
            return null;
        }

        TreeNode root = new TreeNode(Integer.parseInt(currentToken));
        root.left = deserializeHelper(queue);
        root.right = deserializeHelper(queue);

        return root;
    }
}
