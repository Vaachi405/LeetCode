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
    private int secondMin = -1;

    public int findSecondMinimumValue(TreeNode root) {
        int min = root.val;
        secondMinValue(root, min);
        return secondMin;
    }

    private void secondMinValue(TreeNode root, int curr) {
        if (root == null)
            return;
        secondMinValue(root.left, curr);
        secondMinValue(root.right, curr);

        if (root.val > curr) {
            if (secondMin == -1)
                secondMin = root.val;
            else
                secondMin = Math.min(secondMin, root.val);
        }
    }
}