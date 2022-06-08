# Trees

### 2236. Root Equals Sum of Children
checkTree function given in the question is of boolean return type , so simply write
root value = left child value + right child value ....it will return true if it satisfies and false if it doesn't.
```
//the solution is simple
class Solution {
    public boolean checkTree(TreeNode root) {
       return root.val = root.left.val + root.right.val;
    }
}
```

