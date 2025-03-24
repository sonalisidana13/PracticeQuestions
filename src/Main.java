public class Main {
    public static void main(String[] args) {
        // Example Usage
        ListNode l1 = new ListNode(2, new ListNode(4, new ListNode(3))); // Represents 342
        ListNode l2 = new ListNode(5, new ListNode(6, new ListNode(4))); // Represents 465

        AddTwoNumbersNode solution = new AddTwoNumbersNode();
        ListNode result = solution.addTwoNumbers(l1, l2);

        // Print the result
        while (result != null) {
            System.out.print(result.val + " -> ");
            result = result.next;
        }
        System.out.println("null");
    }
}
