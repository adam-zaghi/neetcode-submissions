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
    public int maxCount=1;
    public int maxDepth(TreeNode root) {
        if (root==null)return 0;
      
        dfs(root,1);
        return maxCount;
    }
    public void dfs(TreeNode node, int actualCount){
        if(node.left==null && node.right==null){
            if(actualCount>maxCount)maxCount=actualCount;
            return ;
        }
        actualCount++;
        if(node.left!=null)dfs(node.left,actualCount);
        
        if(node.right!=null)dfs(node.right,actualCount);
    }
}
