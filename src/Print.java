/**
 * Created by zeweiyang on 2017/8/17.
 */
import java.util.ArrayList;
import java.util.Stack;

public class Print {
    public class TreeNode {
        int val = 0;
        TreeNode left = null;
        TreeNode right = null;

        public TreeNode(int val) {
            this.val = val;

        }

    }
    public ArrayList<ArrayList<Integer> > Print(TreeNode pRoot) {
        ArrayList<ArrayList<Integer>> list=new ArrayList<ArrayList<Integer>>();
        if (pRoot==null)
            return list;
        int layer =1;
        Stack<TreeNode> s1=new Stack<TreeNode>();
        s1.push(pRoot);
        Stack<TreeNode> s2=new Stack<TreeNode>();
        while (!s1.isEmpty()||!s2.isEmpty()){
            if (layer%2!=0){
                ArrayList<Integer> temp=new ArrayList<Integer>();
                while (!s1.isEmpty()){
                    TreeNode node =s1.pop();
                    if (node!=null){
                        temp.add(node.val);
                        s2.push(node.left);
                        s2.push(node.right);
                    }
                }
                if (!temp.isEmpty()){
                    list.add(temp);
                    layer++;
                }
            }else {
                ArrayList<Integer> temp=new ArrayList<Integer>();
                while (!s2.isEmpty()){
                    TreeNode node =s2.pop();
                    if (node!=null){
                        temp.add(node.val);
                        s1.push(node.right);
                        s1.push(node.left);
                    }
                }
                if (!temp.isEmpty()){
                    list.add(temp);
                    layer++;
                }
            }
        }
        return list;
    }
}
