/**
 * Created by zeweiyang on 2017/8/7.
 */
public class Convert2 {
    public class TreeNode {
        int val = 0;
        TreeNode left = null;
        TreeNode right = null;

        public TreeNode(int val) {
            this.val = val;

        }

    }
    public TreeNode Convert2(TreeNode root) {
      if (root==null)
          return null;
      if (root.left==null&&root.right==null)
          return root;
      TreeNode left =Convert2(root.left);
      TreeNode p=left;
      while (p!=null&&p.right!=null){
          p=p.right;
      }
      if (left!=null){
          p.right=root;
          root.left=p;
      }
      TreeNode right=Convert2(root.right);
      if (right!=null){
          right.left=root;
          root.right=right;
      }
      return left!=null?left:right;

    }
}
