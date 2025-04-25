package com.shieldteq.algorithm.stack;

import org.junit.jupiter.api.Test;

class StackTest {
    @Test
    public void stackTest() {
        CustomStack myStack = new CustomStack(7);
        myStack.printStack();
        myStack.printAll();
        myStack.makeEmpty();
        myStack.printStack();
        myStack.printAll();
    }
    @Test
    public void pushTest() {
        CustomStack myStack = new CustomStack(7);
        myStack.printStack();
        myStack.push(8);
        myStack.printStack();
    }
    @Test
    public void popTest() {
        CustomStack myStack = new CustomStack(7);
        myStack.printStack();
        System.out.println(myStack.pop().value);
        System.out.println(myStack.pop());
    }
}
