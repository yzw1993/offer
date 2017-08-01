/**
 * Created by zeweiyang on 2017/8/1.
 */
public class Mirror {
    public class TreeNode {
        int val = 0;
        TreeNode left = null;
        TreeNode right = null;

        public TreeNode(int val) {
            this.val = val;

        }

    }
    public void Mirror(TreeNode root) {
       if (root==null)
           return;
       if(root.left==null&&root.right==null)
           return;
       TreeNode tmp=root.left;
       root.left=root.right;
       root.right=tmp;
       if (root.right!=null)
           Mirror(root.right);
       if (root.left!=null)
           Mirror(root.left);
    }
}
