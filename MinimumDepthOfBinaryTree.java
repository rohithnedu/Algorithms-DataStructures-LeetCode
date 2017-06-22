 
 
 /*Given a binary tree, find its minimum depth.

The minimum depth is the number of nodes along the shortest path from the root node down to the nearest leaf node.*/
 
 
 if(root == null) return 0;
    int dep = 1;
    List<TreeNode> que = new ArrayList<TreeNode>();
    que.add(root);
    while(!que.isEmpty()) {
        int size = que.size();
        for(int i = 0; i < size; i++) {
            TreeNode cur = que.remove(0);
            if(cur.left == null && cur.right == null) return dep;
            if(cur.left != null) que.add(cur.left);
            if(cur.right != null) que.add(cur.right);
        }
        dep++;
    }
    return dep;