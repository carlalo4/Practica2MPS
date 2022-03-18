package org.Carlas.DoubleLinkedListQueue;

import org.Carlas.DequeNode.DequeNode;
import org.junit.jupiter.api.AfterEach;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class DoubleLinkedListQueueTest {
    private DoubleLinkedListQueue<Integer> linkedListQueue;

    @BeforeEach
    private void setup() {
        linkedListQueue = new DoubleLinkedListQueue<Integer>();
    }

    @AfterEach
    private void finish() {
        linkedListQueue = null;
    }



}