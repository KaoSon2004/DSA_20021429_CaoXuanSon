public class compare2LList {
    SinglyLinkedListNode c1 = head1;
    SinglyLinkedListNode c2 = head2;
        while (c1!=null&&c2!=null) {
        if (c1.data!=c2.data)
            return false;
        c1 = c1.next;
        c2 = c2.next;
    }
        if (c1==null&&c2==null)
            return true;
        return false;
}
