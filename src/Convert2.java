import apple.laf.JRSUIUtils;

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
    public TreeNode Convert2(TreeNode pRootOfTree) {
        if (pRootOfTree==null)
            return null;
        if (pRootOfTree.left==null&&pRootOfTree.right==null)
            return pRootOfTree;
        TreeNode left=Convert2(pRootOfTree.left);
        TreeNode p=left;
        while (p!=null&&p.right!=null){
            p=p.right;
        }
        if (left!=null){
            p.right=pRootOfTree;
            pRootOfTree.left=p;
        }
        TreeNode right=Convert2(pRootOfTree.right);
        if (right!=null){
            right.left=pRootOfTree;
            pRootOfTree.right=right;
        }
        return left!=null?left:pRootOfTree;
    }
}
