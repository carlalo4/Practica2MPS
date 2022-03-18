package org.Carlas.DoubleLinkedListQueue;

import org.Carlas.DequeNode.DequeNode;
import org.junit.jupiter.api.AfterEach;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class DoubleLinkedListQueueTest<T> {

    private DoubleLinkedListQueue<Integer> linkedListQueue;

    @BeforeEach
    private void setup() {
        linkedListQueue = new DoubleLinkedListQueue<>();
    }

    @AfterEach
    private void finish() {
        linkedListQueue = null;
    }

    @Test
    public void testComputeIfAppendMethodWorksForNotNullList(){
        DequeNode<Integer> node1 = new DequeNode<>(4,null,null);
        DequeNode<Integer> node2 = new DequeNode<>(5,null,null);
        DequeNode<Integer> node3 = new DequeNode<>(3,null,null);
        linkedListQueue.append(node1);
        linkedListQueue.append(node2);
        linkedListQueue.append(node3);
        DequeNode<Integer> expectedValue = node3;
        DequeNode<Integer> obtainedValue = linkedListQueue.peekLast();
        assertEquals(expectedValue, obtainedValue);
    }



}