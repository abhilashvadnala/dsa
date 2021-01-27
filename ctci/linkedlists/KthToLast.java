package ctci.linkedlists;

import ctci.lib.LinkedListNode;

public class KthToLast {

    public void printKthToLastElement(LinkedListNode head, int k) {
        LinkedListNode curr = head;
        int lLen = this.listLen(curr);
        int index = lLen - k + 1;
        while(index == 1) {
            head = head.next;
            index--;
        }
        System.out.println(head.data);
    }

    public int listLen(LinkedListNode head) {
        int len = 0;
        if(head == null) return len;
        LinkedListNode temp = head;
        while(temp != null) {
            len++;
            temp = temp.next;
        }
        return len;
    }

    public static void main(String[] args) {
        // System.out.println();
    }
    
}
