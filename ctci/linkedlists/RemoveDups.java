package ctci.linkedlists;

import ctci.lib.LinkedListNode;

public class RemoveDups {

    public LinkedListNode deleteDuplicates(LinkedListNode head) {
        LinkedListNode current = head;
        while (current != null && current.next != null) {
            if (current.next.data == current.data) {
                current.next = current.next.next;
            } else {
                current = current.next;
            }
        }
        return head;
    }

}
