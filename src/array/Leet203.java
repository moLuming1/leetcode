package array;

public class Leet203 {
    public ListNode removeElements(ListNode head, int val) {
        if (head==null) return null;
        ListNode dummy = new ListNode(-1,head);
        ListNode pre=dummy;
        ListNode current=head;
        while (current!=null){
            if (current.val==val) {
               pre.next=current.next;
            }else{
                pre=current;
            }
            current=current.next;
        }
        return dummy.next;

    }
}
