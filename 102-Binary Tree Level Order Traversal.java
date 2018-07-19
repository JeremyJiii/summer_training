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
    public List<List<Integer>> levelOrder(TreeNode root) {
        List<List<Integer>> list = new ArrayList<List<Integer>>();
        dfs(root,list,0);
        return list;
    }
    private void dfs(TreeNode n, List<List<Integer>> l,int height){
        if(n==null) return;
        if(height>=l.size()) l.add(new ArrayList());
        l.get(height).add(n.val);
        dfs(n.left,l,height+1);
        dfs(n.right,l,height+1);
    }
}
