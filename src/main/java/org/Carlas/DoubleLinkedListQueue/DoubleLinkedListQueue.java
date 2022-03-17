package org.Carlas.DoubleLinkedListQueue;

import org.Carlas.DequeNode.DequeNode;
import org.Carlas.DoubleEndedQueuees.DoubleEndedQueuees;

public class DoubleLinkedListQueue<T> implements DoubleEndedQueuees<T> {
    private DequeNode<T> root;

    public DoubleLinkedListQueue() {
        root = null;
    }

    public void append(DequeNode<T> node) {
        if(root==null){//La lista esta vacia
            root = node;

        }else{//La lista no esta vacia

            //creamos un puntero auxiliar para movernos en la lista
            DequeNode<T> auxiliar = root;

            //Recorremos la lista hasta llegar al ultimo nodo
            while(!auxiliar.isLastNode()){
                auxiliar = auxiliar.getNext();
            }

            //Hemos encontrado el ultimo nodo, lo enlazamos con el nuevo
            auxiliar.setNext(node);
            node.setPrevious(auxiliar);

        }



    }

    public void appendLeft(DequeNode<T> node) {

    }

    public void deleteFirst() {

    }

    public void deleteLast() {

    }

    public DequeNode peekFirst() {
        return null;
    }

    public DequeNode peekLast() {
        return null;
    }

    public int size() {
        return 0;
    }
}
