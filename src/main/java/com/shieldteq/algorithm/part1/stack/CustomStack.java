package com.shieldteq.algorithm.part1.stack;

import lombok.Getter;

@Getter
public class CustomStack {
    public static class Node {
        int value;
        Node next;

        public Node(int value) {
            this.value = value;
        }
    }

    private Node top;
    private int height;

    public CustomStack(int value) {
        top = new Node(value);
        height++;
    }

    public void printStack() {
        Node temp = top;
        while (temp != null) {
            System.out.println(temp.value);
            temp = temp.next;
        }
    }

    public void printAll() {
        if (height == 0) {
            System.out.println("Top: null");
        } else {
            System.out.println("Top: " + top.value);
        }
        System.out.println("Height:" + height);
        System.out.println("\nStack:");
        if (height == 0) {
            System.out.println("empty");
        } else {
            printStack();
        }
    }

    public void makeEmpty() {
        top = null;
        height = 0;
    }


    public void push(int value) {
        Node newNode = new Node(value);
        if(height == 0){
            top = newNode;
        }else {
            newNode.next = top;
            top = newNode;
        }

        height++;
    }

    public Node pop() {
        if(top == null) return null;
        Node temp = top;

        top = top.next;
        temp.next = null;
        height--;
        return temp;
    }
}
