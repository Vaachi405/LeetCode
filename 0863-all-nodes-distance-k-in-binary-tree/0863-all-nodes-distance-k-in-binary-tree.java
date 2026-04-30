/**
 * Definition for a binary tree node.
 * public class TreeNode {
 *     int val;
 *     TreeNode left;
 *     TreeNode right;
 *     TreeNode(int x) { val = x; }
 * }
 */
class Solution {
    private static void markParent(TreeNode root, Map<TreeNode, TreeNode> parent) {
        Queue<TreeNode> queue = new LinkedList<>();
        queue.add(root);

        while (!queue.isEmpty()) {
            TreeNode curr = queue.poll();
            if (curr.left != null) {
                parent.put(curr.left, curr);
                queue.add(curr.left);
            }
            if (curr.right != null) {
                parent.put(curr.right, curr);
                queue.add(curr.right);
            }
        }
    }

    public List<Integer> distanceK(TreeNode root, TreeNode target, int k) {
        Map<TreeNode, TreeNode> parent = new HashMap<>();
        markParent(root, parent);
        Map<TreeNode, Boolean> vis = new HashMap<>();
        Queue<TreeNode> queue = new LinkedList<>();
        queue.add(target);
        vis.put(target, true);
        int level = 0;

        while(!queue.isEmpty()){
            int size = queue.size();
            if(level==k) break;
            level++;
            for(int i=0; i<size; i++){
                TreeNode current = queue.poll();
                if(current.left != null && vis.get(current.left)==null){
                    queue.add(current.left);
                    vis.put(current.left, true);
                }
                if(current.right != null && vis.get(current.right)==null){
                    queue.add(current.right);
                    vis.put(current.right, true);
                }
                if(parent.get(current) != null && vis.get(parent.get(current))==null){
                    queue.add(parent.get(current));
                    vis.put(parent.get(current), true);
                }
            }
        }
        List<Integer> result = new ArrayList<>();
        while(!queue.isEmpty()){
            result.add(queue.poll().val);
        }
        return result;
    }
}