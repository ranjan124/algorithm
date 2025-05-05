package com.shieldteq.algorithm.part1.queue;

import lombok.Getter;

@Getter
public class Queue {

    public static class Node {
        int value;
        Node next;

        public Node(int value) {
            this.value = value;
        }
    }

    private Node first;
    private Node last;
    private int length;

    public Queue(int value) {
        Node node = new Node(value);
        first = node;
        last = node;
        length = 1;
    }

    public void printList() {
        Node temp = first;
        while (temp != null) {
            System.out.println(temp.value);
            temp = temp.next;
        }
    }

    public void printAll() {
        if (length == 0) {
            System.out.println("First: null");
            System.out.println("Last: null");
        } else {
            System.out.println("First: " + first.value);
            System.out.println("Last: " + last.value);
        }
        System.out.println("Length:" + length);
        System.out.println("\nQueue:");
        if (length == 0) {
            System.out.println("empty");
        } else {
            printList();
        }
    }

    public void makeEmpty() {
        first = null;
        last = null;
        length = 0;
    }

    public void enqueue(int value) {
        Node node = new Node(value);
        if (length == 0) {
            first = node;
            last = node;
        } else {
            last.next = node;
            last = node;
        }
        length ++;
    }

    public Node dequeue() {
        if(length == 0) return null;
        Node temp = first;
        if(length == 1) {
            first = null;
            last = null;
        }else {
            first = first.next;
            temp.next = null;
        }
        length--;
        return temp;
    }

}
