package ctci.stacksNQueues.setOfPlates;

import ctci.lib.Stack;

public class StackOfPlates extends Stack<Plate> {

    private int size;
    private int currSize;

    public StackOfPlates(int size) {
        this.size = size;
        this.currSize = 0;
    }

    public void push(Plate p) {
        if(this.currSize < size) {
            super.push(p);
        }
    }

    public boolean isFull() {
        return this.currSize == size;
    }

    public boolean isEmpty() {
        return this.currSize == 0;
    }
    
}
