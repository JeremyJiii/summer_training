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
    public TreeNode constructMaximumBinaryTree(int[] nums) {
        if(nums.length==0) return new TreeNode(0);
        TreeNode root = new TreeNode(nums[0]);
        TreeNode prev = root;
        for(int i=1;i<nums.length;i++){
            TreeNode curr = new TreeNode(nums[i]);
            if(curr.val>root.val){
                TreeNode n = root;
                root = curr;
                root.left = n;
                prev = curr;
                continue;
            }
            if(prev.val>curr.val){
                prev.right = curr;
            }
            else{
                TreeNode search = root;
                while(search.right!=null&&search.right.val>curr.val) search = search.right;
                TreeNode r = search.right;
                search.right = curr;
                curr.left = r;
            }
            prev = curr;
        }
        return root;
    }
}
