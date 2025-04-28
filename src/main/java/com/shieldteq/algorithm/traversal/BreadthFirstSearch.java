package com.shieldteq.algorithm.traversal;

import java.util.LinkedList;
import java.util.List;
import java.util.Queue;

public class BreadthFirstSearch extends BST {
    public BreadthFirstSearch(int value) {
        super(value);
    }

    public List<Integer> traverse() {
        Queue<Node> queue = new LinkedList<>();
        List<Integer> bfsList = new LinkedList<>();
        queue.add(getRoot());
        while (!queue.isEmpty()) {
            Node node = queue.poll();
            if (node.left != null) {
                queue.add(node.left);
            }
            if (node.right != null) {
                queue.add(node.right);
            }
            bfsList.add(node.value);
        }
        return bfsList;
    }

}
