package ctci.linkedlists;

import ctci.lib.AssortedMethods;
import ctci.lib.LinkedListNode;

public class DeleteMiddleNode {

    public static void delete(LinkedListNode n) {

        if(n == null || n.next == null) return;

        LinkedListNode next = n.next;
        n.data = next.data;
        n.next = next.next;

    }

    public static void main(String[] args) {
        int[] arr = {1, 2, 3, 4, 5};
        LinkedListNode head = AssortedMethods.createSLLFromArray(arr);
        System.out.println("Before deleting: "+head.printForward());
        delete(head.next.next);
        System.out.println("After deleting: "+head.printForward());
    }
    
}
