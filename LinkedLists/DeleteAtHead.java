class DeleteAtHead {
    // Problem Description:
    //Given a singly-linked list, write a method to delete the first node of the list and return the new head.

    // Solution Method:
    public ListNode deleteAtHead(ListNode head) {
        if (head == null || head.next == null) { return null; }
        return head.next;
    }
}
