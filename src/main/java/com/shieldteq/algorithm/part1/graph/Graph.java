package com.shieldteq.algorithm.part1.graph;

import lombok.Getter;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

@Getter
public class Graph {
    private final Map<String, List<String>> graph = new HashMap<>();

    public void printGraph() {
        System.out.println(graph);
    }

    public boolean addVertex(String vertex) {
        if (graph.get(vertex) != null) return false;
        graph.putIfAbsent(vertex, new ArrayList<>());
        return true;
    }


    public boolean addEdge(String vertex1, String vertex2) {
        List<String> v1 = graph.get(vertex1);
        List<String> v2 = graph.get(vertex2);
        if (v1 != null && v2 != null) {
            v1.add(vertex2);
            v2.add(vertex1);
            return true;
        }
        return false;
    }


    public boolean removeEdge(String vertex1, String vertex2) {
        List<String> v1 = graph.get(vertex1);
        List<String> v2 = graph.get(vertex2);
        if (v1 == null || v2 == null) return false;
        v1.remove(vertex2);
        v2.remove(vertex1);
        return true;
    }


    public boolean removeVertex(String vertex) {
        List<String> edges = graph.get(vertex);
        if (edges == null) return false;
        for (String edge : edges) {
            graph.get(edge).remove(vertex);
        }
        graph.remove(vertex);
        return true;
    }
}
