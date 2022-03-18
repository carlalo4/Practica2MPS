package org.Carlas.DoubleLinkedListQueue;

import org.Carlas.DequeNode.DequeNode;
import org.junit.jupiter.api.AfterEach;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import java.util.Deque;

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
    public void testComputeIfAppendMethodWorks(){
        DequeNode<Integer> node1 = new DequeNode<>(4,null,null);
        DequeNode<Integer> node2 = new DequeNode<>(5,null,null);
        DequeNode<Integer> node3 = new DequeNode<>(3,null,null);
        linkedListQueue.append(node1);
        linkedListQueue.append(node2);
        linkedListQueue.append(node3);
        assertEquals(node3, linkedListQueue.peekLast());
    }

    @Test
    public void testComputeIfAppendLeftMethodWorks() {
        DequeNode<Integer> node1 = new DequeNode<>(4,null,null);
        DequeNode<Integer> node2 = new DequeNode<>(2,null,null);
        linkedListQueue.appendLeft(node1);
        linkedListQueue.appendLeft(node2);
        assertEquals(node2,linkedListQueue.peekFirst());
    }

    @Test
    public void testComputeIfDeleteFirstMethodWorks() {
        DequeNode<Integer> node1 = new DequeNode<>(4,null,null);
        DequeNode<Integer> node2 = new DequeNode<>(2,null,null);
        linkedListQueue.append(node1);
        linkedListQueue.append(node2);
        linkedListQueue.deleteFirst();
        assertEquals(node2,linkedListQueue.peekFirst());
    }

    @Test
    public void testComputeIfDeleteLastMethodWorks() {
        DequeNode<Integer> node1 = new DequeNode<>(4,null,null);
        DequeNode<Integer> node2 = new DequeNode<>(2,null,null);
        DequeNode<Integer> node3 = new DequeNode<>(3,null,null);
        linkedListQueue.append(node1);
        linkedListQueue.append(node2);
        linkedListQueue.append(node3);
        linkedListQueue.deleteLast();
        assertEquals(node2,linkedListQueue.peekLast());
    }

    @Test
    public void testComputeIfSizeMethodWorks() {
        DequeNode<Integer> node1 = new DequeNode<>(4,null,null);
        DequeNode<Integer> node2 = new DequeNode<>(2,null,null);
        DequeNode<Integer> node3 = new DequeNode<>(3,null,null);
        linkedListQueue.append(node1);
        linkedListQueue.append(node2);
        linkedListQueue.append(node3);
        assertEquals(3,linkedListQueue.size());
    }
}