package com.shieldteq.algorithm.graph;

import org.junit.jupiter.api.Test;

class GraphTest {
    @Test
    public void addVertexTest() {
        Graph myGraph = new Graph();

        System.out.println(myGraph.addVertex("A"));
        System.out.println(myGraph.addVertex("B"));

        System.out.println("Graph:");
        myGraph.printGraph();
    }

    @Test
    public void addEdgeTest() {
        Graph myGraph = new Graph();

        myGraph.addVertex("A");
        myGraph.addVertex("B");


        System.out.println("Graph before addEdge():");
        myGraph.printGraph();


        System.out.println(myGraph.addEdge("A", "B"));


        System.out.println("\nGraph after addEdge():");
        myGraph.printGraph();

    }

    @Test
    public void removeEdgeTest() {

        Graph myGraph = new Graph();

        myGraph.addVertex("A");
        myGraph.addVertex("B");
        myGraph.addVertex("C");

        myGraph.addEdge("A", "B");
        myGraph.addEdge("A", "C");
        myGraph.addEdge("B", "C");


        System.out.println("Graph before removeEdge():");
        myGraph.printGraph();

        System.out.println(myGraph.removeEdge("A", "B"));

        System.out.println("\nGraph after removeEdge():");
        myGraph.printGraph();
    }

    @Test
    public void removeVertexTest() {

        Graph myGraph = new Graph();

        myGraph.addVertex("A");
        myGraph.addVertex("B");
        myGraph.addVertex("C");
        myGraph.addVertex("D");

        myGraph.addEdge("A", "B");
        myGraph.addEdge("A", "C");
        myGraph.addEdge("A", "D");
        myGraph.addEdge("B", "D");
        myGraph.addEdge("C", "D");


        System.out.println("Graph before removeVertex():");
        myGraph.printGraph();

        System.out.println(myGraph.removeVertex("D"));

        System.out.println("\nGraph after removeVertex():");
        myGraph.printGraph();
    }
}
