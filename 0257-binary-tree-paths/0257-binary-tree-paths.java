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
    private void findPaths(TreeNode root, StringBuilder sb, List<String> res){
        if(root==null) return;
        sb.append(root.val);
        if(root.left==null && root.right == null){
            res.add(sb.toString());
            return;
        }
        sb.append("->");
        String s = sb.toString();
        findPaths(root.left,sb,res);
        findPaths(root.right, new StringBuilder(s), res);
        
    }
    public List<String> binaryTreePaths(TreeNode root) {
        List<String> res= new ArrayList<>();
        StringBuilder sb = new StringBuilder();

        findPaths(root,sb,res);

        return res;    
    }
}
