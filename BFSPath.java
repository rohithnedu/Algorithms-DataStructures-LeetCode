public List<String> binaryTreePaths(TreeNode root) {
    ArrayList<String> finalResult = new ArrayList<String>();
 
    if(root==null)
        return finalResult;
 
    ArrayList<String> curr = new ArrayList<String>();
    ArrayList<ArrayList<String>> results = new ArrayList<ArrayList<String>>();
 
    dfs(root, results, curr);
 
    for(ArrayList<String> al : results){
        StringBuilder sb = new StringBuilder();
        sb.append(al.get(0));
        for(int i=1; i<al.size();i++){
            sb.append("->"+al.get(i));
        }
 
        finalResult.add(sb.toString());
    }
 
    return finalResult;
}
 
public void dfs(TreeNode root, ArrayList<ArrayList<String>> list, ArrayList<String> curr){
    curr.add(String.valueOf(root.val));
 
    if(root.left==null && root.right==null){
        list.add(curr);
        return;
    }
 
    if(root.left!=null){
        ArrayList<String> temp = new ArrayList<String>(curr);
        dfs(root.left, list, temp);
    }
 
    if(root.right!=null){
        ArrayList<String> temp = new ArrayList<String>(curr);
        dfs(root.right, list, temp);
    } 
}