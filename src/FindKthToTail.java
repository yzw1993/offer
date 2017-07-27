/**
 * Created by zeweiyang on 2017/7/27.
 */
public class FindKthToTail {
    public class ListNode {
        int val;
        ListNode next = null;

        ListNode(int val) {
            this.val = val;
        }
    }
    public ListNode FindKthToTail(ListNode head,int k) {
      if (head==null||k<1)
          return null;
      ListNode pre =head;
      ListNode last =head;
      for (int i=1;i<k;i++){
          if (pre.next!=null){
              pre=pre.next;
          }
          else
              return null;
      }
      while(pre.next!=null){
          pre=pre.next;
          last=last.next;
      }
      return last;

    }
}
