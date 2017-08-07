/**
 * Created by zeweiyang on 2017/8/7.
 */
public class Clone {
    public class RandomListNode {
        int label;
        RandomListNode next = null;
        RandomListNode random = null;

        RandomListNode(int label) {
            this.label = label;
        }
    }
    public RandomListNode Clone(RandomListNode pHead){
        if (pHead==null)
            return null;
        RandomListNode pCur=pHead;
        //复制next
        while(pCur!=null){
            RandomListNode node=new RandomListNode(pCur.label);
            node.next=pCur.next;
            pCur.next=node;
            pCur=node.next;
        }
        pCur=pHead;
        //复制random
        while(pCur!=null){
            if (pCur.random!=null)
                pCur.next.random=pCur.random.next;
            pCur=pCur.next.next;
        }
        RandomListNode head=pHead.next;
        RandomListNode cur=head;
        pCur=pHead;
        //拆分链表
        while (pCur!=null){
            pCur.next=pCur.next.next;
            if (cur.next!=null)
                cur.next=cur.next.next;
            pCur=pCur.next;
            cur=cur.next;
        }
        return head;
    }

}
