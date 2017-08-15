import java.util.LinkedList;
import java.util.Queue;
/**
 * Created by zeweiyang on 2017/8/14.
 */
public class TreeDepth {
    public class TreeNode {
        int val = 0;
        TreeNode left = null;
        TreeNode right = null;

        public TreeNode(int val) {
            this.val = val;

        }

    }
    public int TreeDepth(TreeNode root) {
        if (root==null)
            return 0;
        Queue<TreeNode> queue=new LinkedList<TreeNode>();
        queue.offer(root);
        int depth=0,count=0,nextCount=1;
        while (queue.size()!=0){
            TreeNode top=queue.poll();
            count++;
            if (top.left!=null){
                queue.add(top.left);
            }
            if (top.right!=null){
                queue.add(top.right);
            }
            if (count==nextCount){
                nextCount =queue.size();
                count =0;
                depth++;
            }
        }
        return depth;

    }
}
