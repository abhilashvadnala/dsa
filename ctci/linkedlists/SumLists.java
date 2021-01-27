package ctci.linkedlists;

import ctci.lib.LinkedListNode;

public class SumLists {

    public static LinkedListNode sumLists(LinkedListNode h1, LinkedListNode h2) {
        LinkedListNode p1 = h1, p2 = h2, s = new LinkedListNode(), s1 = s;
        int c = 0;
        while ((p1 != null) || (p2 != null)) {
            int o1 = 0, o2 = 0, r = 0;
            if (p1 != null)
                o1 = p1.data;
            if (p2 != null)
                o2 = p2.data;
            r = o1 + o2;
            System.err.println(r);
            if (r > 9) {
                c = r / 10;
                r = r % 10;
            }
            s1.next = new LinkedListNode(r + c, null, null);
            p1 = p1.next;
            p2 = p2.next;
            s1 = s1.next;
        }
        return s.next;
    }

    public static int linkedListToInt(LinkedListNode l) {
        int res = 0;
        if(l.next != null) {
            res = 10 * linkedListToInt(l.next);
        }
        return res + l.data;
    }

    public static void main(String[] args) {
        LinkedListNode h1C = new LinkedListNode(6, null, null);
        LinkedListNode h1B = new LinkedListNode(1, h1C, null);
        LinkedListNode h1A = new LinkedListNode(7, h1B, null);

        LinkedListNode h2C = new LinkedListNode(2, null, null);
        LinkedListNode h2B = new LinkedListNode(9, h2C, null);
        LinkedListNode h2A = new LinkedListNode(5, h2B, null);

        System.out.println(h1A.printForward());
        System.out.println(h2A.printForward());
    }

}
