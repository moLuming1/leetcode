package linkTable;

public class Leet707 {

    private int size; //长度
    private ListNode dummy; //虚拟头节点

    public Leet707() {
        size=0;
        dummy=new ListNode(0);
    }

    public int get(int index) {
        if(index<0||index>size-1){
            return -1;
        }
        ListNode current=dummy;
        for (int i = 0; i <= index; i++) {
            current=current.next;
        }
        return current.val;
    }

    public void addAtHead(int val) {
        addAtIndex(0,val);
    }

    public void addAtTail(int val) {
        addAtIndex(size,val);
    }

    public void addAtIndex(int index, int val) {
        if(index>size) return;
        if(index<0) index=0;
        size++;
        ListNode pre=dummy;
        ListNode cur=dummy.next;
        for (int i = 0; i < index; i++) {
            pre=pre.next;
        }
        ListNode node = new ListNode(val);
        ListNode temp=pre.next;
        node.next=temp;
        pre.next=node;
    }

    public void deleteAtIndex(int index) {
        if(index<0||index>=size) return;
        ListNode pre=dummy;
        for (int i = 0; i < index; i++) {
            pre=pre.next;
        }
        pre.next=pre.next.next;
        size--;

    }
}
