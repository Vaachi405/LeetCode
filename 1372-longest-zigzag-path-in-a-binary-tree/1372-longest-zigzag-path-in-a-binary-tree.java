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
    int ans = 0;
    public int longestZigZag(TreeNode root) {
       
        if(root.right == null && root.left == null) return 0;

        dfs(root.left, 1, false);
        dfs(root.right, 1, true);
        
        return ans;
    }

    private void dfs(TreeNode root, int len, boolean flag){
        if(root == null) return;

        ans = Math.max(ans,len);

        if(!flag){
            dfs(root.right, len+1, true);
            dfs(root.left, 1, false);
        }else{
            dfs(root.left, len+1, false);
            dfs(root.right, 1, true);
        }
    }
}