/**
 * Created by zeweiyang on 2017/8/7.
 */
import sun.font.TextRecord;

import java.util.Stack;
public class Convert1 {
    public class TreeNode {
        int val = 0;
        TreeNode left = null;
        TreeNode right = null;

        public TreeNode(int val) {
            this.val = val;
        }
    }
    public TreeNode Convert1(TreeNode root){
        if (root==null)
            return null;
        Stack<TreeNode> stack=new Stack<TreeNode>();
        TreeNode p=root;
        TreeNode pre=null;
        boolean isFirst=true;
        while (p!=null||!stack.isEmpty()){
            while (p!=null){
                stack.push(p);
                p=p.left;
            }
            p=stack.pop();
            if (isFirst){
                root=p;
                pre=root;
                isFirst=false;
            }else{
                pre.right=p;
                p.left=pre;
                pre=p;
            }
            p=p.right;
        }
        return root;
    }
}
