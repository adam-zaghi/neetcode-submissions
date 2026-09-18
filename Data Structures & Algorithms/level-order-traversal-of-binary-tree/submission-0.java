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
    public List<List<Integer>> levelOrder(TreeNode root) {
        List<List<Integer>>res=new ArrayList<>();
        Queue<TreeNode>q=new LinkedList<>();

        q.add(root);
        while (!q.isEmpty()){
            final int siz=q.size();
            List<Integer>level=new ArrayList<>();
            for(int i=0;i<siz;i++){
                TreeNode node=q.poll();
                if(node!=null){
                    q.add(node.left);
                    q.add(node.right);
                    level.add(node.val);
                    }
            }
            if(!level.isEmpty())res.add(level);
            
        }
        return res;
    }
}
