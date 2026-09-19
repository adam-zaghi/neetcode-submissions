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
   
    public int count=0;
    public int goodNodes(TreeNode root) {
        
        dfs(root,root.val);
        return count;
    }
    public void dfs(TreeNode node,int g) {
            if(node==null)return;
            if(node.val>=g){
                g=node.val;
                count++;
            }
            
            dfs(node.left,g);
            dfs(node.right,g);
        }
}
