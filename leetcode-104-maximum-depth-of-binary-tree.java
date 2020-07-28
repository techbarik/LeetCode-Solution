/*
  Contributed by: Md. A. Barik
  Video Explanation: https://youtu.be/O-JZBKnu-y4
*/           
                
class Solution {
    public int maxDepth(TreeNode root) {
        if (root == null) return 0;
        if (root.left == null && root.right == null) return 1;
        int left = maxDepth(root.left);
        int right = maxDepth(root.right);
        return Math.max(left, right) + 1;
    }
}

/* Example:
         1
      /    \
     2      3
    /\      /\
   4  5    7  9
                
md(1): -> 3
    md(2): -> 2
        md(4): -> 1
            md(null): -> 0
            md(null): -> 0
        md(5): -> 1
    md(3): -> 2
        md(7): -> 1
            md(null): -> 0
            md(null): -> 0
        md(9): -> 1
*/
