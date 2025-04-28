package com.shieldteq.algorithm.traversal;

import org.junit.jupiter.api.Test;

class BSTTest {
    @Test
    public void testBreadthFirstSearch() {
        // 47, 21, 76, 18, 27, 52, 82
        BreadthFirstSearch bfs = new BreadthFirstSearch(47);
        bfs.insert(21);
        bfs.insert(76);
        bfs.insert(18);
        bfs.insert(27);
        bfs.insert(52);
        bfs.insert(82);

        System.out.println(bfs.traverse());
    }

    @Test
    public void testBreadthFirstSearchInsertRecursive() {
        // 47, 21, 76, 18, 27, 52, 82
        BreadthFirstSearch bfs = new BreadthFirstSearch(47);
        bfs.rInsert(21);
        bfs.rInsert(76);
        bfs.rInsert(18);
        bfs.rInsert(27);
        bfs.rInsert(52);
        bfs.rInsert(82);

        System.out.println(bfs.traverse());
//        expected : [47, 21, 76, 18, 27, 52, 82]
    }
    //          47
    //         /  \
    //       21    76
    //      /  \   / \
    //     18  27 52 82

    @Test
    public void testDepthFirstSearchPreorderRecursive() {
        // 47, 21, 76, 18, 27, 52, 82
        DepthFirstSearchPreOrder dfsPot = new DepthFirstSearchPreOrder(47);
        dfsPot.insert(21);
        dfsPot.insert(76);
        dfsPot.insert(18);
        dfsPot.insert(27);
        dfsPot.insert(52);
        dfsPot.insert(82);
        System.out.println(dfsPot.rPreOrderTraversal());
//        expected : [47, 21, 18, 27, 76, 52, 82]
    }

    @Test
    public void testDepthFirstSearchPreorder() {
        // 47, 21, 76, 18, 27, 52, 82
        DepthFirstSearchPreOrder dfsPot = new DepthFirstSearchPreOrder(47);
        dfsPot.insert(21);
        dfsPot.insert(76);
        dfsPot.insert(18);
        dfsPot.insert(27);
        dfsPot.insert(52);
        dfsPot.insert(82);
        System.out.println(dfsPot.preOrderTraversal());
//        expected : [47, 21, 18, 27, 76, 52, 82]
    }

    @Test
    public void testDepthFirstSearchPostOrderRecursive() {
        // 47, 21, 76, 18, 27, 52, 82
        DepthFirstSearchPostOrder dfsPost = new DepthFirstSearchPostOrder(47);
        dfsPost.insert(21);
        dfsPost.insert(76);
        dfsPost.insert(18);
        dfsPost.insert(27);
        dfsPost.insert(52);
        dfsPost.insert(82);
        System.out.println(dfsPost.rPostOrderTraversal());
//        expected : [18, 27, 21, 52, 82, 76, 47]
    }

    @Test
    public void testDepthFirstSearchPostOrder() {
        // 47, 21, 76, 18, 27, 52, 82
        DepthFirstSearchPostOrder dfsPost = new DepthFirstSearchPostOrder(47);
        dfsPost.insert(21);
        dfsPost.insert(76);
        dfsPost.insert(18);
        dfsPost.insert(27);
        dfsPost.insert(52);
        dfsPost.insert(82);
        System.out.println(dfsPost.postOrderTraversal());
//        expected : [18, 27, 21, 52, 82, 76, 47]
    }

    @Test
    public void testDepthFirstSearchInOrder() {
        // 47, 21, 76, 18, 27, 52, 82
        DepthFirstSearchInOrder dfsPost = new DepthFirstSearchInOrder(47);
        dfsPost.insert(21);
        dfsPost.insert(76);
        dfsPost.insert(18);
        dfsPost.insert(27);
        dfsPost.insert(52);
        dfsPost.insert(82);
        System.out.println(dfsPost.rInOrderTraversal());
//        expected : [18, 21, 27, 47, 52, 76, 82]
    }

    @Test
    public void testDepthFirstSearchIOrder() {
        // 47, 21, 76, 18, 27, 52, 82
        DepthFirstSearchInOrder dfsPost = new DepthFirstSearchInOrder(47);
        dfsPost.insert(21);
        dfsPost.insert(76);
        dfsPost.insert(18);
        dfsPost.insert(27);
        dfsPost.insert(52);
        dfsPost.insert(82);
        System.out.println(dfsPost.inOrderTraversal());
//        expected : [18, 21, 27, 47, 52, 76, 82]
    }

    @Test
    public void testDepthFirstSearchIOrder2() {
        // 47, 21, 76, 18, 27, 52, 82
        DepthFirstSearchInOrder dfsPost = new DepthFirstSearchInOrder(47);
        dfsPost.insert(21);
        dfsPost.insert(76);
        dfsPost.insert(18);
        dfsPost.insert(27);
        dfsPost.insert(52);
        dfsPost.insert(82);
        System.out.println(dfsPost.rInOrderTraversal2());
//        expected : [18, 21, 27, 47, 52, 76, 82]
    }

}
