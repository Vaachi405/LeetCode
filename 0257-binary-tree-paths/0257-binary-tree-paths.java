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
    public List<String> binaryTreePaths(TreeNode root) {
        List<String> result = new ArrayList<>();
        if (root == null)
            return result;
        findPath(root, "", result);
        return result;
    }

    private void findPath(TreeNode node, String path, List<String> result) {
        if (path.isEmpty())
            path += node.val;
        else
            path += "->" + node.val;

        if (node.left == null && node.right == null) {
            result.add(path);
            return;
        }

        if (node.left != null)
            findPath(node.left, path, result);
        if (node.right != null)
            findPath(node.right, path, result);
    }
}