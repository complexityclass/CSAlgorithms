package com.complexityclass.collections;

import com.complexityclass.collections.interfaces.Stack;

import java.util.Iterator;

/**
 * Created with IntelliJ IDEA.
 * User: complexityclass
 * Date: 7/20/13
 * Time: 12:46 PM
 * To change this template use File | Settings | File Templates.
 */
public class StackOnArray<Item> implements Stack<Item>, Iterable<Item> {

    public static final int MIN_STACK_CAPACITY = 2;

    Item[] container;
    int capacity;
    int size;
    int top;

    public StackOnArray() {
        this.container = (Item[]) new Object[MIN_STACK_CAPACITY];
        this.size = 0;
        this.top = 0;
        capacity = MIN_STACK_CAPACITY;
    }


    @Override
    public Iterator<Item> iterator() {
        return new StackArrayIterator();
    }

    private void increaseCapasity() {
        Item[] array = (Item[]) new Object[2 *  container.length];
        System.arraycopy(container, 0, array, 0, container.length);
        capacity = array.length;
        container = array;
    }

    @Override
    public void push(Item item) {
        size++;
        if (size == capacity) {
            increaseCapasity();
        }
        container[top++] = item;
    }

    @Override
    public void pop() {
        assert (!isEmpty());
        size--;
        top--;

    }

    @Override
    public boolean isEmpty() {
        return top < 0;
    }

    private class StackArrayIterator<Item> implements Iterator<Item> {

        int current = top;

        @Override
        public boolean hasNext() {
            return current > 0;
        }

        @Override
        public Item next() {
            Item item = (Item) container[current];
            current++;
            return item;
        }

        @Override
        public void remove() {
            throw new UnsupportedOperationException();
        }
    }
}
