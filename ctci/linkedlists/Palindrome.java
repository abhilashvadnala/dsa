package ctci.linkedlists;

import java.util.Stack;

import ctci.lib.LinkedListNode;

public class Palindrome {

    public static boolean isPalindrome(LinkedListNode l) {
        LinkedListNode p = l;
        Stack<Integer> s = new Stack<Integer>();
        while(p != null) {
            s.push(p.data);
            p = p.next;
        }
        while(p != null) {
            if(p.data == s.pop())
                p = p.next;
            else
                return false;
        }
        return true;
    }

    public static void main(String[] args) {
        LinkedListNode h1C = new LinkedListNode(1, null, null);
        LinkedListNode h1B = new LinkedListNode(7, h1C, null);
        LinkedListNode h1A = new LinkedListNode(7, h1B, null);
        System.out.println(isPalindrome(h1A));
    }
    
}
