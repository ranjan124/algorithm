package com.shieldteq.algorithm.stack;

import java.util.Stack;

public class OtherExercises {
    public static String reverseString(String s) {
        char[] arr = s.toCharArray();
        Stack<Character> stack = new Stack<>();
        StringBuilder reversedString = new StringBuilder();
        for (char c : arr) {
            stack.push(c);
        }
        while (!stack.isEmpty()) {
            reversedString.append(stack.pop());
        }
        return reversedString.toString();
    }


    public static boolean isBalancedParentheses(String testStr) {
        if (testStr == null || testStr.isEmpty()) return true;
        Stack<Character> stack = new Stack<>();
        char[] chars = testStr.toCharArray();
        for (char c : chars) {
            if (c == '(') {
                stack.push(c);
            } else if (c == ')') {
                if (stack.isEmpty() || stack.pop() != '(') {
                    return false;
                }
            }
        }
        return stack.isEmpty();
    }

    public static void sortStack(Stack<Integer> stack) {
        if(stack.isEmpty()) return;
        Stack<Integer> tempStack = new Stack<>();

        while(!stack.isEmpty()){
            Integer temp = stack.pop();
            while(!tempStack.isEmpty() && tempStack.peek() > temp){
                stack.push(tempStack.pop());
            }
            tempStack.push(temp);
        }
        while(!tempStack.isEmpty()){
            stack.push(tempStack.pop());
        }
    }
}
