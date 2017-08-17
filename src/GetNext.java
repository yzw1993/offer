/**
 * Created by zeweiyang on 2017/8/16.
 */
public class GetNext {
    public class TreeLinkNode {
        int val;
        TreeLinkNode left = null;
        TreeLinkNode right = null;
        TreeLinkNode next = null;

        TreeLinkNode(int val) {
            this.val = val;
        }
    }
    public TreeLinkNode GetNext(TreeLinkNode pNode) {
        if (pNode==null)
            return pNode;
        if (pNode.right!=null){
            pNode=pNode.right;
            while (pNode.left!=null)
                pNode=pNode.left;
            return pNode;
        }else if (pNode.next!=null&&pNode.next.left==pNode) {
            return pNode.next;
        }else if (pNode.next!=null&&pNode.next.right==pNode){
            while (pNode.next!=null&&pNode.next.left!=pNode){
                pNode=pNode.next;
            }
            return pNode.next;
        }else {
            return pNode.next;
        }
    }
}
