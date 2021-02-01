package ctci.stacksNQueues;

import ctci.lib.Stack;

public class SortedStack extends Stack<Integer> {

    Stack<Integer> sorted, temp;

    public SortedStack() {
        sorted = new Stack<Integer>();
        temp = new Stack<Integer>();
    }

    public void push(int x) {
        if(!sorted.isEmpty()) {
            if(x < sorted.peek()) {
                sorted.push(x);
            } else {
                while(x <= sorted.peek()) {
                    temp.push(sorted.pop());
                }
                sorted.push(x);
                shiftStacks(temp, sorted);
            }
        } else {
            sorted.push(x);
        }
    }

    // public int pop() {
    //     return sorted.pop();
    // }

    public void shiftStacks(Stack<Integer> from, Stack<Integer> to) {
        while(!from.isEmpty()) {
            to.push(from.pop());
        }
    }
    
}
