package linkTable;

public class Leet19 {
    public ListNode removeNthFromEnd(ListNode head, int n) {
        ListNode dummy = new ListNode(-1);
        dummy.next=head;
        ListNode cur=head;
        int size=0;
        while (cur.next!=null){
            size++;
            cur=cur.next;
        }
        cur=head;
        int i=size-n;
        ListNode pre=dummy;
        while (i>-1){
            pre=pre.next;
            cur=cur.next;
            i--;
        }
        pre.next=cur.next;
        return dummy.next;
    }
}
