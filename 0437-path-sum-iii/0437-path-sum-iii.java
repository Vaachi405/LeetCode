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
    int count = 0;

    public int pathSum(TreeNode root, int targetSum) {
        pathSum(root, targetSum, new ArrayList<>());
        return count;
    }

    void pathSum(TreeNode root, int targetSum, List<Integer> path){
        if(root==null) return;

        path.add(root.val);
        long sum=0;

        for(int i= path.size()-1; i>=0; i--){
            sum+=path.get(i);
            if(sum==targetSum) count++;
        }

        pathSum(root.left, targetSum, path);
        pathSum(root.right, targetSum, path);

        path.remove(path.size()-1);
    }
}