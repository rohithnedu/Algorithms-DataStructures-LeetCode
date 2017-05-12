public class Solution {
	public int kthSmallest(TreeNode root, int k) {
        if (root == null || k <= 0) {
            return -1;
        }

        Stack<TreeNode> stack = new Stack<TreeNode>();
        stack.push(root);
        TreeNode node = root;
        while(!stack.isEmpty()) {
            //Left first
            while (node != null && node.left != null) { 
                stack.add(node.left);
                node = node.left;
            }
            //Process left/curr
            node = stack.pop();
            k--;
            if (k == 0) {
                return node.val;
            }
            node = node.right;
            if (node != null) {
                stack.push(node);
            }
         }

         return -1;
    }

}



// Recursive
public class Solution {
    public int kthSmallest(TreeNode root, int k) {
        if (root == null || k <= 0) {
            return -1;
        }
        
        ArrayList<TreeNode> rst = new ArrayList<TreeNode>();
        helper(rst, root, k);
        
        if (rst.size() < k) {
            return -1;
        }
        return rst.get(k - 1).val;
    }
    
    
    public void helper(ArrayList<TreeNode> rst, TreeNode node, int k) {
        if (rst.size() == k) {
            return;
        }
        if (node.left == null && node.right == null) {
            rst.add(node);
            return;
        }
        
        if (node.left != null) {
            helper(rst, node.left, k);
        }
        rst.add(node);
        if (node.right != null) {
            helper(rst, node.right, k);
        }
    }
}