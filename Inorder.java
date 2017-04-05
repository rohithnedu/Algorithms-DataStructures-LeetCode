
// 94. Binary Tree Inorder Traversal 

/**
 * Definition for a binary tree node.
 * public class TreeNode {
 *     int val;
 *     TreeNode left;
 *     TreeNode right;
 *     TreeNode(int x) { val = x; }
 * }
 */
public class Solution {
    public List<Integer> inorderTraversal(TreeNode root) {
        
        List<Integer>  res = new ArrayList<Integer>();
        Stack<TreeNode> stack = new Stack<TreeNode>();
        TreeNode cur = root ;
        
        while( cur != null || !stack.isEmpty()) {
          while(cur != null){
            stack.push(cur);
            cur = cur.left ;
        }
        
        cur = stack.pop();
        res.add(cur.val);
        cur = cur.right;
        
    }
 
        return res;
    }
}