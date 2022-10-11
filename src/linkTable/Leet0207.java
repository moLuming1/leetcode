package linkTable;

public class Leet0207 {
    public ListNode getIntersectionNode(ListNode headA, ListNode headB) {
        ListNode curA=headA;
        ListNode curB=headB;
        int lengthA=0;
        int lengthB=0;
        //计算出两条链表长度
        while (curA!=null){
            lengthA++;
            curA=curA.next;
        }
        while (curB!=null){
            lengthB++;
            curB=curB.next;
        }
        //确保A始终代表长的那条链表(方便下面统一处理)
        curA=headA;
        curB=headB;
        if(lengthB>lengthA){
            int temp=lengthA;
            lengthA=lengthB;
            lengthB=temp;
            ListNode tempNode=curA;
            curA=curB;
            curB=tempNode;
        }
        int gap=lengthA-lengthB;
        while (gap>0){
            gap--;
            curA=curA.next;
        }
        while (curA!=null){
            if(curA==curB){
                return curA;
            }
            curA=curA.next;
            curB=curB.next;
        }
        return null;
    }


}
