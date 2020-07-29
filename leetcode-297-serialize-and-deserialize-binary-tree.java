/*
  Contributed by: Md. A. Barik
  Video Explanation: https://youtu.be/RNYNiMsHU0w
  LeetCode URL: https://leetcode.com/problems/serialize-and-deserialize-binary-tree/
*/

public class Codec {
    public String serialize(TreeNode root) {
        if(root == null) {
            return "X";
        }
        String leftSerialized = serialize(root.left);
        String rightSerialized = serialize(root.right);
        return root.val + "," + leftSerialized + "," + rightSerialized;
    }

    public TreeNode deserialize(String data) {
        Queue<String> nodesLeft = new LinkedList<>();
        nodesLeft.addAll(Arrays.asList(data.split(",")));
        return deserializeHelper(nodesLeft);
    }
    
    public TreeNode deserializeHelper(Queue<String> nodesLeft) {
        String valueForNode = nodesLeft.poll();
        if(valueForNode.equals("X")) return null;
        TreeNode newNode = new TreeNode(Integer.valueOf(valueForNode));
        newNode.left  = deserializeHelper(nodesLeft);
        newNode.right = deserializeHelper(nodesLeft);
        return newNode;
    }
}
