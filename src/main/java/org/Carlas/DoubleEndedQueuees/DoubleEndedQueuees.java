package org.Carlas.DoubleEndedQueuees;

import org.Carlas.DequeNode.DequeNode;

import java.util.Comparator;

public interface DoubleEndedQueuees<T> {
    // Basic operations
    void append(DequeNode<T> node) ;
    void appendLeft(DequeNode<T> node) ;
    void deleteFirst() ;
    void deleteLast() ;
    DequeNode<T> peekFirst() ;
    DequeNode<T> peekLast() ;
    int size() ;
    // Complex operations
    DequeNode<T> getAt(int position) ;
    DequeNode<T> find (T item) ;
    void delete(DequeNode<T> node) ;
    void sort(Comparator<T> comparator) ;

    // Complex operations
    // (Estas operaciones se incluirán más adelante para ser realizadas en la segunda
    // sesión de laboratorio de esta práctica.)
}
