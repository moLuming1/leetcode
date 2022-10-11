package linkTable;

public class Leet206 {
    public ListNode reverseList(ListNode head) {
       return reversed(head,null);
    }
    public ListNode reversed(ListNode cur,ListNode pre){
        if(cur==null) return pre;
        ListNode temp=cur.next;
        cur.next=pre;
        pre=cur;
        cur=temp;
        return reversed(cur,pre);
    }
}
