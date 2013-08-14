package com.complexityclass.collections;

import com.complexityclass.collections.interfaces.Stack;

import java.util.Iterator;
import java.util.NoSuchElementException;

/**
 * Created with IntelliJ IDEA.
 * User: complexityclass
 * Date: 7/17/13
 * Time: 11:25 PM
 * The Stack realization on Linked List
 */
public class StackOnLinkedList<Item> implements Stack<Item>, Iterable<Item> {


    private class Node {
        Item item;
        Node next;
    }

    private Node top;
    private int size;

    public StackOnLinkedList() {
        this.size = 0;
        this.top = null;
        assert check();
    }

    public boolean isEmpty() {
        return size == 0;
    }

    private boolean check() {
        if (size == 0) {
            if (top != null) return false;
        } else if (size > 0) {
            if (top == null) return false;
        } else {
            return false;
        }

        return true;
    }

    public void push(Item item) {
        Node oldTop = top;
        top = new Node();
        top.item = item;
        top.next = oldTop;
        size++;
        assert check();
    }

    public void pop() {
        if (!isEmpty()) {
            top = top.next;
            size--;
        }
        assert check();
    }

    public Item peek() {
        if (!isEmpty()) {
            return top.item;
        } else {
            return null;
        }
    }

    public String toString() {
        String result = "top : ";
        for (Iterator<Item> it = iterator(); it.hasNext(); ) {
            Item item = it.next();
            result += item.toString();
        }

        return result;
    }

    @Override
    public Iterator<Item> iterator() {
        return new StackIterator();
    }

    private class StackIterator implements Iterator<Item> {
        Node current = top;

        @Override
        public boolean hasNext() {
            return current != null;
        }

        @Override
        public Item next() {
            if (!hasNext()) throw new NoSuchElementException();
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
