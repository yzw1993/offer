/**
 * Created by zeweiyang on 2017/7/26.
 */
public class CreactTree {
    public class TreeNode{
        int val;
        TreeNode left;
        TreeNode right;
        TreeNode(int x){
            val =x;
        }
    }
    public TreeNode reConstructBinaryTree(int [] pre,int [] in){
        int i=0;
        if(pre.length==0||in.length==0||pre.length!=in.length){
            return null;
        }
        TreeNode root=new TreeNode(pre[0]);
        while(in[i]!=root.val){
            i++;
        }
        int[] preLeft =new int[i];
        int[] inLeft =new int[i];
        int[] preRight =new int[pre.length-i-1];
        int[] inRight =new int[in.length-i-1];
        for (int j =0;j<pre.length;j++){
            if (j<i){
                preLeft[j]=pre[j+1];
                inLeft[j]=pre[j];
            }
            else if(j>i){
                preRight[j-i-1]=pre[j];
                inRight[j-i-1]=in[j];
            }
        }
        root.left=reConstructBinaryTree(preLeft,inLeft);
        root.right=reConstructBinaryTree(preRight,inRight);
        return root;

    }
}
