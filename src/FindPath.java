/**
 * Created by zeweiyang on 2017/8/4.
 */
import java.util.ArrayList;

public class FindPath {
    public class TreeNode {
        int val = 0;
        TreeNode left = null;
        TreeNode right = null;

        public TreeNode(int val) {
            this.val = val;

        }

    }
    public ArrayList<ArrayList<Integer>> FindPath(TreeNode root,int target){
        ArrayList<ArrayList<Integer>> pathlist=new ArrayList<ArrayList<Integer>>();
        if (root==null||root.val>target)
            return pathlist;
        ArrayList<Integer> path =new ArrayList<Integer>();
        findPath(root,target,pathlist,path);
        return pathlist;

    }

    private void findPath(TreeNode root,int target,ArrayList<ArrayList<Integer>> pathlist,ArrayList<Integer> path){
        if (root ==null||root.val>target){
            path.clear();
        }else if (root.val==target){
            if (root.left==null&&root.right==null){
                path.add(root.val);
                pathlist.add(path);
            }
            else{
                path.clear();
            }
        }else{
            path.add(root.val);
            ArrayList<Integer> path2=new ArrayList<Integer>();
            path2.addAll(path);
            target -=root.val;
            findPath(root.left,target,pathlist,path);
            findPath(root.right,target,pathlist,path2);

        }
    }
}

