/*Given a binary tree, return all root-to-leaf paths.*/


//Recursive

public List<String> binaryTreePaths(TreeNode root) {
    List<String> answer = new ArrayList<String>();
    if (root != null) searchBT(root, "", answer);
    return answer;
}
private void searchBT(TreeNode root, String path, List<String> answer) {
    if (root.left == null && root.right == null) answer.add(path + root.val);
    if (root.left != null) searchBT(root.left, path + root.val + "->", answer);
    if (root.right != null) searchBT(root.right, path + root.val + "->", answer);
}


//Iterative Approach
public List<String> binaryTreePaths(TreeNode root) {
    List<String> res = new ArrayList<>();
    if (root == null) {
        return res;
    }
    Queue<TreeNode> queue = new LinkedList<>();
    Queue<String> path = new LinkedList<>();
    path.offer(root.val + "");
    queue.offer(root);
    while (!queue.isEmpty()) {
        TreeNode cur = queue.poll();
        String item = path.poll();
        if (cur.left == null && cur.right == null) {
            res.add(item);
        }
        if (cur.left != null) {
            queue.offer(cur.left);
            path.offer(item + "->" + cur.left.val + "");
        }
        if (cur.right != null) {
            queue.offer(cur.right);
            path.offer(item + "->" + cur.right.val + "");
        }
    }
    return res;
}