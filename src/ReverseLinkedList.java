public class ReverseLinkedList {

    public static void main (String [] args){

        //1->2->3->4->5
        ListNode head = new ListNode(1);
        head.next = new ListNode(2);
        head.next.next = new ListNode(3);
        head.next.next.next = new ListNode(4);
        head.next.next.next.next = new ListNode(5);

        ListNode reverseList = reverseList(head);

        while(reverseList !=null){
            System.out.print(" " + reverseList.val);
            reverseList = reverseList.next;
        }

        System.out.println(reverseList);

    }

    public static ListNode reverseList(ListNode head) {
        ListNode current = head;
        ListNode prev = null;
        ListNode next;
        while(current != null){
            //store next
            next = current.next;
            //Reverse current nodes next pointer
            current.next = prev;

            //move pointers one position ahead
            prev = current;
            current = next;

        }
        return prev;
    }
}
