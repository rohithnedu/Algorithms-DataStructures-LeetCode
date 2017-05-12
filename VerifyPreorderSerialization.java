 /* 
 One way to serialize a binary tree is to use pre-order traversal. When we encounter a non-null node, we record the node's value. If it is a null node, we record using a sentinel value such as #.
 
 */
 
 
 
 public boolean isValidSerialization(String preorder) {
    String[] strs = preorder.split(",");
    int degree = -1;         // root has no indegree, for compensate init with -1
    for (String str: strs) {
        degree++;             // all nodes have 1 indegree (root compensated)
        if (degree > 0) {     // total degree should never exceeds 0
            return false;
        }      
        if (!str.equals("#")) {// only non-leaf node has 2 outdegree
            degree -= 2;
        }  
    }
    return degree == 0;
}