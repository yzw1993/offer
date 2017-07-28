/**
 * Created by zeweiyang on 2017/7/27.
 */
public class ReverseList {
    public class ListNode {
        int val;
        ListNode next = null;
        ListNode(int val) {
            this.val = val;
        }
    }
    public ListNode ReverseList(ListNode head) {
        if (head ==null)
            return null;
        ListNode pre=null;
        ListNode current=head;
        ListNode temp =null;
        ListNode reverseHead=null;
        while(current!=null){
            temp=current.next;
            current.next=pre;
            if(temp==null){
                current=reverseHead;
            }
            pre=current;
            current=temp;
        }
        return reverseHead;
    }
}
