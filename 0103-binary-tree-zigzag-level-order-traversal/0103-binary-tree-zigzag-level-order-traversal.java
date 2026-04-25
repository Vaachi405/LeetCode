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
    public List<List<Integer>> zigzagLevelOrder(TreeNode root) {
        List<List<Integer>> result = new ArrayList<>();
        if (root == null)
            return result;

        Queue<TreeNode> queue = new LinkedList<>();
        queue.add(root);
        boolean dir = true; //for direction

        while (!queue.isEmpty()) {
            int size = queue.size();
            Integer row[] = new Integer[size]; //temporary array

            for (int i = 0; i < size; i++) {
                TreeNode node = queue.poll();
                int index = dir ? i : size - 1 - i; 
                //to get the index of where to store the value 
                row[index] = node.val;

                if (node.left != null)
                    queue.add(node.left);
                if (node.right != null)
                    queue.add(node.right);
            }

            dir = !dir;
            result.add(Arrays.asList(row));
        }
        return result;
    }
}