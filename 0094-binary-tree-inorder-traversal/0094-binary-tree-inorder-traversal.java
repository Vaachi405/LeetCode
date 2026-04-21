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
    public List<Integer> inorderTraversal(TreeNode root) {
        List<Integer> ans = new ArrayList<>();
        if(root == null)
            return ans;
        Stack<TreeNode> stack = new Stack<>();
        TreeNode node = root;
        while(true){
            if(node!=null){
                stack.push(node);
                node = node.left; //left
            }
            else{
                if(stack.isEmpty()) break; // to break the loop
                node = stack.pop();
                ans.add(node.val); //root
                node = node.right; //right
            }
        }
        return ans;
    }
}
//iterative approach