package com.complexityclass.collections;

import com.complexityclass.collections.interfaces.Queue;

import java.util.Iterator;
import java.util.NoSuchElementException;

/**
 * Created with IntelliJ IDEA.
 * User: vpopov
 * Date: 18.07.13
 * Time: 12:44
 * To change this template use File | Settings | File Templates.
 */
public class QueueOnLinkedList<Item> implements Iterable<Item>, Queue<Item> {

    private class Node {
        Item item;
        Node next;
        Node prev;
    }

    private int size;
    private Node head;
    private Node tail;

    public QueueOnLinkedList() {
        this.size = 0;
        this.head = null;
        this.tail = null;
    }

    public boolean isEmpty() {
        return size == 0;
    }

    public void queue(Item item) {
        Node oldTail = tail;
        tail = new Node();
        tail.item = item;

        if (!isEmpty()) {
            tail.item = item;
            tail.next = oldTail;
            oldTail.prev = tail;
            tail.prev = null;
            size++;
        } else {
            tail.next = null;
            tail.prev = null;
            head = tail;
        }
    }

    public Item dequeue() {

        if (isEmpty()) throw new NoSuchElementException();
        Node oldHead = head;
        head = head.prev;
        head.next = null;
        size--;

        return oldHead.item;

    }

    boolean check() {
        if (size == 0) {
            if (!(head == null && tail == null)) return false;
        } else if (size == 1) {
            if (!((head == tail) && head != null)) return false;
        } else {
            if (!((head != tail) && head != null && tail != null)) return false;
        }

        return true;
    }


    @Override
    public Iterator<Item> iterator() {
        return new QueueIterator();
    }

    private class QueueIterator implements Iterator<Item> {

        Node current = tail;

        @Override
        public boolean hasNext() {
            if (current != head) return true;
            return false;
        }

        @Override
        public Item next() {
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
