package ctci.stacksNQueues.setOfPlates;

import java.util.ArrayList;

public class SetOfSP extends StackOfPlates {

    ArrayList<StackOfPlates> stacks = new ArrayList<StackOfPlates>();

    int size;

    public SetOfSP(int size) {
        super(size);
        this.size = size;
    }

    public void push() {}

    public Plate pop() {
        return new Plate(0);
    }

    public boolean isEmpty() {
        return false;
    }

    public StackOfPlates getLastStack() {
        return new StackOfPlates(0);
    }
    
}
