package ctci.linkedlists;

import ctci.lib.LinkedListNode;

public class LoopDetection {

    public static LinkedListNode isLoop(LinkedListNode l) {
        LinkedListNode slow = l, fast = l;
        while(fast != null && fast.next != null) {
            if(slow==fast) return slow;
            slow = slow.next;
            fast = fast.next.next;
        }
        return null;
    }

    public static void main(String[] args) {
        LinkedListNode h1A, h1B, h1C, h1D, h1E, h1F;
        
        h1F = new LinkedListNode(6, null, null);
        h1E = new LinkedListNode(1, h1F, null);
        h1D = new LinkedListNode(7, h1E, null);
        h1C = new LinkedListNode(2, h1D, null);
        h1B = new LinkedListNode(9, h1C, null);
        h1A = new LinkedListNode(5, h1B, null);
        h1F.setNext(h1C);

        System.out.println(isLoop(h1A).data);
    }
     
}
