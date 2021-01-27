package ctci.stacksNQueues;

import java.util.Arrays;

public class FixedMultiStack {

    private int numOfStacks;
    private int stackSize;
    private int[] stacks, tops;

    /**
     * 
     * @param numOfStacks
     * @param stackSize
     */
    public FixedMultiStack(int numOfStacks, int stackSize) {
        this.numOfStacks = numOfStacks;
        this.stackSize = stackSize;
        stacks = new int[stackSize*numOfStacks];
        tops = new int[numOfStacks];
        Arrays.fill(tops, -1);
    }

    public void push(int stackNum, int value) throws Exception {
        if(stackNum < 1 || stackNum > numOfStacks) throw new Exception();
        if(tops[stackNum-1] > stackSize-1) throw new Exception("stack size exceeded");
        this.tops[stackNum-1]++;
        this.stacks[(stackNum-1)*stackSize+tops[stackNum-1]] = value;
    }

    public int pop(int stackNum) throws Exception {
        int val = stacks[tops[stackNum-1]];
        if(val == 0) throw new Exception("empty stack");
        stacks[(stackNum-1)*stackSize+tops[stackNum-1]] = 0;
        tops[stackNum-1]--;
        return val;
    }

    public int peek(int stackNum) {
        return stacks[(stackNum-1)*stackSize+tops[stackNum - 1]];
    }

    public boolean isEmpty(int stackNum) {
        return tops[stackNum-1] == -1;
    }

    public boolean isFull(int stackNum) {
        return tops[stackNum - 1] == stackSize-1;
    }

    public void printStack(int stackNum) {
        System.out.println("Stack: "+stackNum);
        for(int i = (stackNum-1)*stackSize; i < (stackNum-1)*stackSize+stackSize; i++) {
            System.out.print(stacks[(stackNum-1)*stackSize+tops[stackNum-1]]+", ");
        }
    }

    public void printMultiStack() {
        int stackN = 0;
        for(int i = 0; i < this.stacks.length; i++) {
            if(((i%stackSize) == 0)) {
                stackN++;
                System.out.println("Stack: " + stackN);
            }
            System.out.println(this.stacks[i]);
        }
    }

    public void printTops() {
        System.out.println("tops: ");
        System.out.println(Arrays.toString(this.tops));
    }
    
}
