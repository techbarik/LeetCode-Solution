/*
  Contributed by: Md. A. Barik
  Video Explanation: https://youtu.be/ciXw0txwh6M
*/
class Solution {
    public TreeNode invertTree(TreeNode root) {
        if (root == null) {
            return null;
        }
        TreeNode right = invertTree(root.right);
        TreeNode left = invertTree(root.left);
        root.left = right;
        root.right = left;
        return root;
    }
}
