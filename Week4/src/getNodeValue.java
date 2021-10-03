public class getNodeValue {
    public static int getNode(SinglyLinkedListNode llist, int positionFromTail) {
        SinglyLinkedListNode current = llist;
        int count = 0;
        while (current !=null) {
            count ++;
            current = current.next;
        }
        current = llist;
        for (int i=0; i<count - positionFromTail-1;i++) {
            current = current.next;
        }
        return current.data;
    }
}
