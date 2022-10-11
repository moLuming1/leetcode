package linkTable;

public class Leet24 {
    public ListNode swapPairs(ListNode head) {
        if(head==null) {return null;}
        ListNode dummy = new ListNode(0);
        dummy.next=head;
        ListNode cur=dummy;
        while (cur.next==null&&cur.next.next==null){
            ListNode temp1=cur.next;
            ListNode temp2=cur.next.next.next;
            cur.next=cur.next.next;
            cur.next.next=temp1;
            cur.next.next.next=temp2;
            cur=cur.next.next.next;
        }
        return dummy.next;
    }
}
