package org.Carlas.DoubleLinkedListQueue;

import org.Carlas.DequeNode.DequeNode;
import org.Carlas.DoubleEndedQueuees.DoubleEndedQueuees;

import java.util.Deque;

public class DoubleLinkedListQueue<T> implements DoubleEndedQueuees<T> {
    private DequeNode<T> root;

    public DoubleLinkedListQueue() {
        root = null;
    }

    private void recorrerLista(DequeNode<T> node){
        while(!node.isLastNode()){
             node = node.getNext();
        }
    }

    public void append(DequeNode<T> node) {
        if(root==null){//La lista esta vacia
            root = node;

        }else{//La lista no esta vacia

            //creamos un puntero auxiliar para movernos en la lista
            DequeNode<T> auxiliar = root;

            //Recorremos la lista hasta llegar al ultimo nodo
            recorrerLista(auxiliar);

            //Hemos encontrado el ultimo nodo, lo enlazamos con el nuevo
            auxiliar.setNext(node);
            node.setPrevious(auxiliar);

        }

    }

    public void appendLeft(DequeNode<T> node) {
        if (root != null){
            node.setNext(root);
            root.setPrevious(node);
        }
        root = node;
    }

    public void deleteFirst() {
        if (root!=null) {
            root = root.getNext();
            root.setPrevious(null);
        }
    }

    public void deleteLast() {
        if (root!=null) {
            DequeNode<T> auxiliar = root;
            recorrerLista(auxiliar);
            auxiliar.getPrevious().setNext(null);
            auxiliar.setPrevious(null);
        }
    }

    public DequeNode peekFirst() {
        return root;
    }

    public DequeNode peekLast() {
        DequeNode<T> res = root;
        recorrerLista(res);
        return res;
    }

    public int size() {
        DequeNode<T> auxiliar = root;
        int cont = 0;
        while (!auxiliar.isLastNode()) {
            cont++;
            auxiliar = auxiliar.getNext();
        }
        return cont;
    }
}
