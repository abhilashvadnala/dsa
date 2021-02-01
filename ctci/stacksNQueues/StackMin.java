package ctci.stacksNQueues;

import ctci.lib.Stack;

public class StackMin extends Stack<Integer> {

    private Stack<Integer> minStack;

    public StackMin() {
        this.minStack = new Stack<Integer>();
    }

    public void push(int d) {
        if(d <= min())
            minStack.push(d);
        super.push(d);
    }

    public int min() {
        if(minStack.isEmpty())
            return Integer.MAX_VALUE;
        else
            return minStack.peek();
    }
    
}
