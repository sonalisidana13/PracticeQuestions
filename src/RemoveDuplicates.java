public class RemoveDuplicates {

    public static void main(String [] args){
        ListNode head = new ListNode(1);
        head.next = new ListNode(2);
        head.next.next = new ListNode(2);
        head.next.next.next = new ListNode(4);
        head.next.next.next.next = new ListNode(5);

        ListNode newNode = deleteDuplicates(head);

        while(newNode !=null){
            System.out.print(" " + newNode.val);
            newNode = newNode.next;
        }
    }

    public static ListNode deleteDuplicates(ListNode head) {
        ListNode current = head;

        while(current != null && current.next != null){
            if(current.val == current.next.val){
                current.next = current.next.next; // skip duplicate
            } else {
                current = current.next;
            }
        }

        return head;

    }
}
