package ctci.lib;

public class AssortedMethods {

    public static LinkedListNode createSLLFromArray(int[] vals) {
        if(vals.length == 0) {
            System.out.println("Input can't be empty");
            return null;
        }
        LinkedListNode head = new LinkedListNode(vals[0], null, null);
        LinkedListNode prev = head;
        for(int i = 1; i < vals.length; i++) {
            LinkedListNode curr = new LinkedListNode(vals[i], null, prev);
            prev = curr;
        }
        return head;
    }

    public static void main(String[] args) {
        int[] list = {1, 3, 5, 7, 9};
        LinkedListNode h = createSLLFromArray(list);
        System.out.println(h.printForward());
    }
    
}
