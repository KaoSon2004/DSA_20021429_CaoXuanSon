public class insertTail {
    static SinglyLinkedListNode insertNodeAtTail(SinglyLinkedListNode head, int data) {
        if (head == null) {
            SinglyLinkedListNode newNode = new SinglyLinkedListNode(data);
            newNode.next = null;
            return newNode;
        }
        SinglyLinkedListNode newNode = new SinglyLinkedListNode(data);
        newNode.next = null;
        SinglyLinkedListNode current = head;
        while (current.next!=null) {
            current = current.next;
        }
        current.next = newNode;
        return head;


    }
}
