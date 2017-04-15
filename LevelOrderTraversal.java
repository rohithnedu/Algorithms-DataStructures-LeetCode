//102. Binary Tree Level Order Traversal 

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
    public List<List<Integer>> levelOrder(TreeNode root) {
        
          List<List<Integer>> result = new ArrayList<List<Integer>>();
          
          if(root == null) {
              return result;
          }
        
        Queue<TreeNode> queue = new LinkedList<TreeNode>();
        queue.offer(root);
        
        int cSize = 0 ;
        
        while(!queue.isEmpty())  {
            
            List<Integer> curList = new ArrayList<Integer>();
            
            cSize = queue.size();
            
            for( int i = 0 ; i < cSize ;i++){
                
                TreeNode node = queue.poll();
                curList.add(node.val);
                if(node.left!=null){
                    queue.offer(node.left);
                }
                if(node.right!=null){
                    queue.offer(node.right);
                }
                
            }
            
            result.add(curList);
            
            
        }
        
        return result;
        
        
    }
}