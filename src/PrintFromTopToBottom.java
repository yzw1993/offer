/**
 * Created by zeweiyang on 2017/8/3.
 */
import java.util.ArrayList;
import java.util.LinkedList;
import java.util.Queue;

public class PrintFromTopToBottom {
    public class TreeNode {
        int val = 0;
        TreeNode left = null;
        TreeNode right = null;

        public TreeNode(int val) {
            this.val = val;

        }

    }
    public ArrayList<Integer> PrintFromTopToBottom(TreeNode root) {
        ArrayList<Integer> arrayList=new ArrayList<Integer>();
        if (root==null){
            return arrayList;
        }
        Queue<TreeNode> q=new LinkedList<>();
        q.offer(root);
        while(!q.isEmpty()){
            TreeNode p=q.poll();
            arrayList.add(p.val);
            if (p.left!=null)
                q.offer(p.left);
            if (p.right!=null)
                q.offer(p.right);
        }
        return arrayList;
    }
}
