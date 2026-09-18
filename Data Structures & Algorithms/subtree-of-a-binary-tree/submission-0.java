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
    //public boolean res=false; 

    public boolean isSubtree(TreeNode root, TreeNode subRoot) {
        if(root==null){
            return false;
        }
        if(dfsSameTree(root,subRoot)){
            return true;
        }else{
            return isSubtree(root.left,subRoot) ||isSubtree(root.right,subRoot) ;
        }
        
    }
    public boolean dfsSameTree(TreeNode node, TreeNode subRoot){
        if(node==null && subRoot==null){
            return true;
        }
        if(node!=null && subRoot!=null && node.val==subRoot.val){
            return dfsSameTree(node.left,subRoot.left) && dfsSameTree(node.right,subRoot.right);   
        }else{
            return false;
        }
       
             
    }
}
