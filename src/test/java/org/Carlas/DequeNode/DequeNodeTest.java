package org.Carlas.DequeNode;

import org.Carlas.DequeNode.DequeNode;
import org.junit.jupiter.api.AfterEach;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class DequeNodeTest<T> {
    private DequeNode<T> deque;
    private T item;
    private DequeNode<T> next;
    private DequeNode<T> previous;

    @BeforeEach
    private void setup() {
        deque = new DequeNode(item, next, previous);
    }

    @AfterEach
    private void finish() {
        deque = null;
    }

    @Test
    public void testComputeIfNodeIsTheFirstNode() {
        previous = null;
        assertTrue(deque.isFirstNode());

    }
    @Test
    public void testComputeIfNodeIsTheLastNode() {
        next = null;
        assertTrue(deque.isLastNode());
    }

    @Test
    //node1-node2-node3
    public void testComputeIfNodeIsNotTheLastNorTheFirstNode() {
        DequeNode<Integer> node1 = new DequeNode<Integer>(8,null,null);
        DequeNode<Integer> node2 = new DequeNode<Integer>(8,null,null);
        DequeNode<Integer> node3 = new DequeNode<Integer>(8,null,null);

        node1.setNext(node2);
        node2.setPrevious(node1);
        node2.setNext(node3);
        node3.setPrevious(node2);

        assertTrue(node2.isNotATerminalNode());

    }


}