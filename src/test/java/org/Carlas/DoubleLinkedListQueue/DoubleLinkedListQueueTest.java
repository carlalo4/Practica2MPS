package org.Carlas.DoubleLinkedListQueue;

import org.Carlas.DequeNode.DequeNode;
import org.junit.jupiter.api.AfterEach;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import java.util.Deque;

import static org.junit.jupiter.api.Assertions.*;

class DoubleLinkedListQueueTest<T> {

    private DoubleLinkedListQueue<Integer> linkedListQueue;
    private DequeNode<Integer> node1, node2, node3;

    @BeforeEach
    private void setup() {
        linkedListQueue = new DoubleLinkedListQueue<>();
        node1 = new DequeNode<>(4,null,null);
        node2 = new DequeNode<>(5,null,null);
        node3 = new DequeNode<>(3,null,null);
    }

    @AfterEach
    private void finish() {
        linkedListQueue = null;
    }

    @Test
    public void testComputeIfAppendMethodWorks(){
        linkedListQueue.append(node1);
        linkedListQueue.append(node2);
        linkedListQueue.append(node3);
        assertEquals(node3, linkedListQueue.peekLast());
    }

    @Test
    public void testComputeIfAppendLeftMethodWorks() {
        linkedListQueue.appendLeft(node1);
        linkedListQueue.appendLeft(node2);
        assertEquals(node2,linkedListQueue.peekFirst());
    }

    @Test
    public void testComputeIfDeleteFirstMethodWorks() {
        linkedListQueue.append(node1);
        linkedListQueue.append(node2);
        linkedListQueue.deleteFirst();
        assertEquals(node2,linkedListQueue.peekFirst());
    }

    @Test
    public void testComputeIfDeleteLastMethodWorks() {
        linkedListQueue.append(node1);
        linkedListQueue.append(node2);
        linkedListQueue.append(node3);
        linkedListQueue.deleteLast();
        assertEquals(node2,linkedListQueue.peekLast());
    }

    @Test
    public void testComputeIfSizeMethodWorks() {
        linkedListQueue.append(node1);
        linkedListQueue.append(node2);
        linkedListQueue.append(node3);
        assertEquals(3,linkedListQueue.size());
    }

    @Test
    public void testComputeIfGetAtMethodWorks(){
        linkedListQueue.append(node1);
        linkedListQueue.append(node2);
        linkedListQueue.append(node3);
        assertEquals(node2, linkedListQueue.getAt(2));
    }

    @Test
    public void testComputeIfGetAtMethodRaiseExceptionIfEmptyList(){
        assertThrows(RuntimeException.class, () -> linkedListQueue.getAt(2)) ;
    }

    @Test
    public void testComputeIfGetAtMethodRaiseExceptionIfPositionGivenHigherThanSize(){
        linkedListQueue.append(node1);
        linkedListQueue.append(node2);
        linkedListQueue.append(node3);
        assertThrows(RuntimeException.class, () -> linkedListQueue.getAt(5)) ;
    }

    @Test
    public void testComputeIfDeleteMethodWorks(){
        linkedListQueue.append(node1);
        linkedListQueue.append(node2);
        linkedListQueue.append(node3);

        int expectedValue = linkedListQueue.size()-1;
        linkedListQueue.delete(node2);

        assertEquals(expectedValue, linkedListQueue.size());

    }



}