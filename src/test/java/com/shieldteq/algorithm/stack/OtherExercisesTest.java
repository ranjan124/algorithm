package com.shieldteq.algorithm.stack;

import org.junit.jupiter.api.Test;

import java.util.Stack;

import static com.shieldteq.algorithm.stack.OtherExercises.sortStack;
import static org.junit.jupiter.api.Assertions.*;

class OtherExercisesTest {
    @Test
    public void reverseStringTest() {
        assertEquals("olleh", OtherExercises.reverseString("hello"));
    }
    @Test
    public void balanceParenthesesTest () {
        assertTrue(OtherExercises.isBalancedParentheses("()"));
        assertTrue(OtherExercises.isBalancedParentheses("(())()"));
        assertFalse(OtherExercises.isBalancedParentheses("(()()"));
    }
    @Test
    public void sortStackTest () {
        Stack<Integer> stack = new Stack<>();
        stack.push(4);
        stack.push(1);
        stack.push(3);
        stack.push(2);
        stack.push(5);
        sortStack(stack);
        stack.forEach(System.out::println);
    }




}
