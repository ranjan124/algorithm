package com.shieldteq.algorithm.linkedlist;

import lombok.extern.slf4j.Slf4j;
import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

@Slf4j
class LinkedListTest {

    @Test
    void printList() {
        /*
         EXPECTED OUTPUT:
         ----------------
         Head: 4
         Tail: 4
         Length: 1

         Linked List:
         4

         */
        LinkedList myLinkedList = new LinkedList(4);

        myLinkedList.getHead();
        myLinkedList.getTail();
        myLinkedList.getLength();

        System.out.println("\nLinked List:");
        myLinkedList.printList();
    }

    @Test
    public void appendListTest() {
        /*
       		EXPECTED OUTPUT:
        	----------------
        	Head: 1
        	Tail: 2
        	Length: 2

        	Linked List:
        	1
        	2

     	*/
        LinkedList myLinkedList = new LinkedList(1);
        myLinkedList.makeEmpty();
        myLinkedList.append(1);
        myLinkedList.append(2);

        myLinkedList.getHead();
        myLinkedList.getTail();
        myLinkedList.getLength();

        System.out.println("\nLinked List:");
        myLinkedList.printList();

    }

    @Test
    public void removeLastTest() {

        LinkedList myLinkedList = new LinkedList(1);
        myLinkedList.append(2);

        // (2) Items - Returns 2 Node
        System.out.println(myLinkedList.removeLast().value);
        // (1) Item - Returns 1 Node
        System.out.println(myLinkedList.removeLast().value);
        // (0) Items - Returns null
        System.out.println(myLinkedList.removeLast());


    	/*
        	EXPECTED OUTPUT:
        	----------------
        	2
        	1
        	null

     	*/

    }

    @Test
    public void prependTest() {
        LinkedList myLinkedList = new LinkedList(2);
        myLinkedList.append(3);

        System.out.println("Before prepend():");
        System.out.println("-----------------");
        myLinkedList.getHead();
        myLinkedList.getTail();
        myLinkedList.getLength();

        System.out.println("\nLinked List:");
        myLinkedList.printList();

        myLinkedList.prepend(1);

        System.out.println("\n\nAfter prepend():");
        System.out.println("----------------");
        myLinkedList.getHead();
        myLinkedList.getTail();
        myLinkedList.getLength();

        System.out.println("\nLinked List:");
        myLinkedList.printList();

        /*
            EXPECTED OUTPUT:

            Before prepend():
            -----------------
            Head: 2
            Tail: 3
            Length: 2

            Linked List:
            2
            3


            After prepend():
            ----------------
            Head: 1
            Tail: 3
            Length: 3

            Linked List:
            1
            2
            3

        */

    }

    @Test
    public void removeFirstTest() {

        LinkedList myLinkedList = new LinkedList(2);
        myLinkedList.append(1);

        // (2) Items - Returns 2 Node
        System.out.println(myLinkedList.removeFirst().value);
        // (1) Item - Returns 1 Node
        System.out.println(myLinkedList.removeFirst().value);
        // (0) Items - Returns null
        System.out.println(myLinkedList.removeFirst());


        /*
            EXPECTED OUTPUT:
            ----------------
            2
            1
            null

        */

    }

    @Test
    public void getElementTest() {
        LinkedList myLinkedList = new LinkedList(0);
        myLinkedList.append(1);
        myLinkedList.append(2);
        myLinkedList.append(3);


        System.out.println(myLinkedList.get(3).value);


        /*
            EXPECTED OUTPUT:
            ----------------
            3

        */

    }

    @Test
    public void setElementTest() {
        LinkedList myLinkedList = new LinkedList(0);
        myLinkedList.append(1);
        myLinkedList.append(2);
        myLinkedList.append(3);

        System.out.println("Linked List before set():");
        myLinkedList.printList();

        myLinkedList.set(2, 99);

        System.out.println("\nLinked List after set():");
        myLinkedList.printList();


        /*
            EXPECTED OUTPUT:
            ----------------
            Linked List before set():
            0
            1
            2
            3

            Linked List after set():
            0
            1
            99
            3

        */


    }

    @Test
    public void insertTest() {

        LinkedList myLinkedList = new LinkedList(1);
        myLinkedList.append(3);

        System.out.println("LL before insert():");
        myLinkedList.printList();

        myLinkedList.insert(1, 2);

        System.out.println("\nLL after insert(2) in middle:");
        myLinkedList.printList();

        myLinkedList.insert(0, 0);

        System.out.println("\nLL after insert(0) at beginning:");
        myLinkedList.printList();

        myLinkedList.insert(4, 4);

        System.out.println("\nLL after insert(4) at end:");
        myLinkedList.printList();


        /*
            EXPECTED OUTPUT:
            ----------------
            LL before insert():
            1
            3

            LL after insert(2) in middle:
            1
            2
            3

            LL after insert(0) at beginning:
            0
            1
            2
            3

            LL after insert(4) at end:
            0
            1
            2
            3
            4

        */

    }

    @Test
    public void removeTest() {


        LinkedList myLinkedList = new LinkedList(1);
        myLinkedList.append(2);
        myLinkedList.append(3);
        myLinkedList.append(4);
        myLinkedList.append(5);

        System.out.println("LL before remove():");
        myLinkedList.printList();

        System.out.println("\nRemoved node:");
        System.out.println(myLinkedList.remove(2).value);
        System.out.println("LL after remove() in middle:");
        myLinkedList.printList();

        System.out.println("\nRemoved node:");
        System.out.println(myLinkedList.remove(0).value);
        System.out.println("LL after remove() of first node:");
        myLinkedList.printList();

        System.out.println("\nRemoved node:");
        System.out.println(myLinkedList.remove(2).value);
        System.out.println("LL after remove() of last node:");
        myLinkedList.printList();


        /*
            EXPECTED OUTPUT:
            ----------------
            LL before remove():
            1
            2
            3
            4
            5

            Removed node:
            3
            LL after remove() in middle:
            1
            2
            4
            5

            Removed node:
            1
            LL after remove() of first node:
            2
            4
            5

            Removed node:
            5
            LL after remove() of last node:
            2
            4

        */

    }

    @Test
    public void reverseTest() {

        LinkedList myLinkedList = new LinkedList(1);
        myLinkedList.append(2);
        myLinkedList.append(3);
        myLinkedList.append(4);

        System.out.println("LL before reverse():");
        myLinkedList.printList();

        myLinkedList.reverse();

        System.out.println("\nLL after reverse():");
        myLinkedList.printList();


        /*
            EXPECTED OUTPUT:
            ----------------
            LL before reverse():
            1
            2
            3
            4

            LL after reverse():
            4
            3
            2
            1

        */

    }

    @Test
    public void findMiddleNodeTest() {

        LinkedList myLinkedList = new LinkedList(1);
        System.out.println(myLinkedList.findMiddleNode().value);
        myLinkedList.append(2);
        System.out.println(myLinkedList.findMiddleNode().value);
        myLinkedList.append(3);
        System.out.println(myLinkedList.findMiddleNode().value);
        myLinkedList.append(4);
        System.out.println(myLinkedList.findMiddleNode().value);
        myLinkedList.append(5);
        System.out.println(myLinkedList.findMiddleNode().value);
    }
    @Test
    public void findMiddleNode1Test() {

        LinkedList myLinkedList = new LinkedList(1);
        System.out.println(myLinkedList.findMiddleNode1().value);
        myLinkedList.append(2);
        System.out.println(myLinkedList.findMiddleNode1().value);
        myLinkedList.append(3);
        System.out.println(myLinkedList.findMiddleNode1().value);
        myLinkedList.append(4);
        System.out.println(myLinkedList.findMiddleNode1().value);
        myLinkedList.append(5);
        System.out.println(myLinkedList.findMiddleNode1().value);
    }

    @Test
    public void findKthFromEndTest() {

        LinkedList myLinkedList = new LinkedList(1);
        myLinkedList.append(2);
        myLinkedList.append(3);
        myLinkedList.append(4);
        myLinkedList.append(5);
        Assertions.assertEquals(4, myLinkedList.findKthFromEnd(1).value);
        Assertions.assertEquals(3, myLinkedList.findKthFromEnd(2).value);
    }
    @Test
    public void hasLoopTest() {
        LinkedList myLinkedList = new LinkedList(1);
        myLinkedList.append(2);
        myLinkedList.append(3);
        System.out.println(myLinkedList.hasLoop());
    }
    @Test
    public void removeDuplicatesTest() {
        LinkedList myLinkedList = new LinkedList(1);
        myLinkedList.append(1);
        myLinkedList.append(1);
        myLinkedList.append(1);
        myLinkedList.append(3);
        myLinkedList.append(3);
        myLinkedList.append(5);
        myLinkedList.append(2);
        myLinkedList.append(1);
        myLinkedList.removeDuplicates();
        myLinkedList.printList();
    }

    @Test
    public void partitionListTest() {
        LinkedList myLinkedList = new LinkedList(1);
        myLinkedList.append(1);
        myLinkedList.append(1);
        myLinkedList.append(1);
        myLinkedList.append(3);
        myLinkedList.append(3);
        myLinkedList.append(5);
        myLinkedList.append(2);
        myLinkedList.append(1);
        myLinkedList.partitionList(3);
        myLinkedList.printList();
    }

    @Test
    public void binaryToDecimalTest() {
        LinkedList myLinkedList = new LinkedList(1);
        myLinkedList.append(0);
        myLinkedList.append(1);
        myLinkedList.append(0);
        System.out.println(myLinkedList.binaryToDecimal());
    }

    @Test
    public void reverseBetweenTest() {
        LinkedList myLinkedList = new LinkedList(1);
        myLinkedList.append(2);
        myLinkedList.append(3);
        myLinkedList.append(4);
        myLinkedList.append(5);
        myLinkedList.append(6);
        myLinkedList.append(7);
        myLinkedList.append(8);
        myLinkedList.append(9);
        myLinkedList.reverseBetween(3, 7);
        myLinkedList.printList();
    }
}

