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
    public int maxLevelSum(TreeNode root) {
        List<Integer> sum = new ArrayList<>();

        bfs(root, 1, sum);
        int max = Integer.MIN_VALUE;

        for(int num: sum){
            max = Math.max(num,max);
        }
        for(int i=0; i<sum.size(); i++){
            if(sum.get(i)==max) return i+1;
        }
        return 0;
    }

    private static void bfs(TreeNode root, int level, List<Integer> sum){
        if(root == null) return;

        if (sum.size() < level) {
            sum.add(root.val);
        } else {
            sum.set(level - 1, sum.get(level - 1) + root.val);
        }

        bfs(root.left, level+1, sum);
        bfs(root.right, level+1, sum);
    }
}