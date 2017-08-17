/**
 * Created by zeweiyang on 2017/8/17.
 */
import java.util.ArrayList;
import java.util.LinkedList;
import java.util.Queue;

public class Print2 {
    public class TreeNode {
        int val = 0;
        TreeNode left = null;
        TreeNode right = null;

        public TreeNode(int val) {
            this.val = val;

        }

    }
    ArrayList<ArrayList<Integer> > Print(TreeNode pRoot) {
        ArrayList<ArrayList<Integer>> result= new ArrayList<ArrayList<Integer>>();
        if (pRoot==null)
            return result;
        Queue<TreeNode> layer=new LinkedList<TreeNode>();
        ArrayList<Integer> layerList=new ArrayList<Integer>();
        layer.offer(pRoot);
        int start=0,end=1;
        while(!layer.isEmpty()){
            TreeNode cur=layer.poll();
            layerList.add(cur.val);
            start++;
            if (cur.left!=null)
                layer.add(cur.left);
            if (cur.right!=null)
                layer.add(cur.right);
            if (start==end){
                end=layer.size();
                start=0;
                result.add(layerList);
                layerList=new ArrayList<Integer>();
            }
        }
        return result;
    }
}
