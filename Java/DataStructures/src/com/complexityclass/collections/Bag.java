package com.complexityclass.collections;

import java.util.*;

/**
 * Created with IntelliJ IDEA.
 * User: vpopov
 * Date: 17.07.13
 * Time: 16:29
 * To change this template use File | Settings | File Templates.
 */
public class Bag<Item> implements Iterable<Item> {

    private int size;
    private Node first;

    private class Node {
        private Item item;
        private Node next;
    }

    public Bag() {
        first = null;
        size = 0;
        assert check();
    }

    public boolean isEmpty() {
        return first == null;
    }

    public int size() {
        return size;
    }

    public void add(Item item) {
        Node oldFirst = first;
        first = new Node();
        first.item = item;
        first.next = oldFirst;
        size++;

        assert check();
    }

    private boolean check() {
        if (size == 0) {
            if (first != null) return false;
        } else if (size == 1) {
            if (first == null) return false;
            if (first.next != null) return false;

        } else {
            if (first.next == null) return false;
        }

        int countNodes = 0;
        for(Node x = first; x != null; x = x.next){
            countNodes++;
        }

        if(countNodes != size) return false;

        return true;
    }


    @Override
    public Iterator<Item> iterator() {
        return new ListIterator();
    }

    private class ListIterator implements Iterator<Item>{

        private Node current = first;

        @Override
        public boolean hasNext() {
            return current != null;
        }

        @Override
        public Item next() {
            if(!hasNext()) throw new NoSuchElementException();
            Item item = current.item;
            current = current.next;
            return item;
        }

        @Override
        public void remove() {
            throw new UnsupportedOperationException();
        }
    }
}
