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
    int res = 0,depth=0;
    public int findBottomLeftValue(TreeNode root) {
        return dfs(root,1);
    }
    public int dfs(TreeNode root,int arch){
        if(root==null)
            return 0;
        
        if(arch>depth){
            res = root.val;
            depth+=1;
        }
        dfs(root.left,arch+1);
        dfs(root.right,arch+1);
        return res;
    }
}
