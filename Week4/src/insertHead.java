public class insertHead {
    static SinglyLinkedListNode insertNodeAtHead(SinglyLinkedListNode llist, int data) {
        if (llist==null) {
            SinglyLinkedListNode newNode = new SinglyLinkedListNode(data);
            newNode.next=null;
            return newNode;
        }
        SinglyLinkedListNode newNode = new SinglyLinkedListNode(data);
        newNode.next = llist;
        llist = newNode;
        return llist;

    }

}
