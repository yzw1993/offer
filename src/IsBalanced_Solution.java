/**
 * Created by zeweiyang on 2017/8/15.
 */
public class IsBalanced_Solution {
    private boolean isBalanced=true;
    public boolean IsBalanced_Solution(TreeDepth.TreeNode root) {
        getDepth(root);
        return isBalanced;
    }
    public int getDepth(TreeDepth.TreeNode root){
        if (root==null)
            return 0;
        int left=getDepth(root.left);
        int right=getDepth(root.right);
        if (Math.abs(left-right)>1){
            isBalanced=false;
        }
        return right>left?right+1:left+1;
    }
}
