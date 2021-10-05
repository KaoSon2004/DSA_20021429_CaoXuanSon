public class merge2 {
    static SinglyLinkedListNode mergeLists(SinglyLinkedListNode head1, SinglyLinkedListNode head2) {
        SinglyLinkedListNode c1 = head1;
        SinglyLinkedListNode c2 = head2;
        SinglyLinkedListNode ans;
        if (c1.data < c2.data) {
            ans = c1;
            c1 = c1.next;
        }
        else {
            ans = c2;
            c2 = c2.next;
        }
        SinglyLinkedListNode tmp =ans;
        while (true) {
            if (c1 == null) {
                ans.next = c2;
                break;
            }
            if (c2 == null) {
                ans.next = c1;
                break;
            }
            if (c1.data<=c2.data) {
                ans.next = c1;
                c1 = c1.next;
                ans = ans.next;
            }
            else {
                ans.next = c2;
                c2 = c2.next;
                ans = ans.next;
            }
        }
        return tmp;

    }
}
