package org.Carlas.DoubleLinkedListQueue;

import org.Carlas.DequeNode.DequeNode;
import org.Carlas.DoubleEndedQueuees.DoubleEndedQueuees;

import java.util.Comparator;
import java.util.Deque;

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
            while(!auxiliar.isLastNode()){
                auxiliar = auxiliar.getNext();
            }
            auxiliar.getPrevious().setNext(null);
            auxiliar.setPrevious(null);
        }
    }

    public DequeNode peekFirst() {
        return root;
    }

    public DequeNode peekLast() {
        DequeNode<T> res = root;
        while(!res.isLastNode()){
            res = res.getNext();
        }
        return res;
    }

    public int size() {
        DequeNode<T> auxiliar = root;
        int cont = 1;
        while (!auxiliar.isLastNode()) {
            cont++;
            auxiliar = auxiliar.getNext();
        }
        return cont;
    }

    @Override
    public DequeNode<T> getAt(int position) {
        if(root==null){
            throw new RuntimeException("Lista vacia");
        }

        if(size() < position) {
            throw new RuntimeException("El tama??o es menor que la posici??n indicada");
        }


        int cont = 1;
        DequeNode<T> res = root;
        while (cont < position) {
            res = res.getNext();
            cont++;
        }
        return res;

    }

    @Override
    public DequeNode<T> find(T item) {

        if (root == null) {
            throw new RuntimeException("Lista vacia");
        }

        DequeNode<T> res = root;
        while (!res.getItem().equals(item)) {
            res = res.getNext();
        }

        if(res.equals(null)){
            throw new RuntimeException("El item no est?? en la lista");
        }

        return res;
    }

    @Override
    public void delete(DequeNode<T> node) {
        DequeNode<T> res = find(node.getItem());

        res.getPrevious().setNext(res.getNext());
        res.getNext().setPrevious(res.getPrevious());

        res.setPrevious(null);
        res.setNext(null);

    }

    @Override

    public void sort(Comparator<T> comparator) {
        if (root == null) {
            throw new RuntimeException("Lista vacia");
        }

        DequeNode<T> current= null;
        DequeNode<T> siguiente= null;
        T temporal;

        for(current = root; current.getNext() != null; current = current.getNext()) {

            for (siguiente = current.getNext(); siguiente != null; siguiente = siguiente.getNext()) {

                if (comparator.compare(current.getItem(), siguiente.getItem()) > 0) {
                    temporal = current.getItem();
                    current.setItem(siguiente.getItem());
                    siguiente.setItem(temporal);
                }
            }
        }

    }

}
