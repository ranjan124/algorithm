package com.shieldteq.algorithm.queue;

import org.junit.jupiter.api.Test;

class QueueTest {
    @Test
    public void queueTest() {
        Queue myQueue = new Queue(7);
        myQueue.printAll();
        myQueue.makeEmpty();
        myQueue.printAll();
    }

    @Test
    public void enqueueTest() {
        Queue myQueue = new Queue(7);
        myQueue.printAll();
        myQueue.enqueue(1);
        myQueue.printAll();
    }

    @Test
    public void dequeueTest() {
        Queue myQueue = new Queue(7);
        myQueue.enqueue(6);
        myQueue.enqueue(1);
        System.out.println(myQueue.dequeue().value);
        myQueue.enqueue(3);
        System.out.println(myQueue.dequeue().value);
        myQueue.enqueue(5);
        System.out.println(myQueue.dequeue().value);
        System.out.println(myQueue.dequeue().value);
        System.out.println(myQueue.dequeue().value);
        System.out.println(myQueue.dequeue());
    }


}
