package ctci.stacksNQueues;

import ctci.lib.Stack;

public class StackMin2 extends Stack<StackMinNode> {

    public void push(int val, int min) {
        int newMin = Math.min(val, min());
        super.push(new StackMinNode(val, newMin));
    }

    public int min() {
        if(this.isEmpty())
            return Integer.MAX_VALUE;
        else
            return peek().min;
    }
    
}
