package com.complexityclass.collections;

import com.complexityclass.collections.interfaces.Queue;

import java.util.Iterator;

/**
 * Created with IntelliJ IDEA.
 * User: vpopov
 * Date: 18.07.13
 * Time: 15:32
 * To change this template use File | Settings | File Templates.
 */
public class QueueOnDynamicArray<Item> implements Queue<Item>, Iterable<Item> {

    public static final int MIN_SIZE = 2;

    private Item[] storage;
    private int size;
    private int head;
    private int tail;

    private String ol = "";

    public QueueOnDynamicArray() {
        this.storage = (Item[]) new Object[MIN_SIZE];
        this.size = 0;
        this.head = 0;
        this.tail = 0;
    }

    private void increaseCapacity(int capacity) {
        if (capacity > size) {
            Item[] array = (Item[]) new Object[capacity];
            System.arraycopy(storage, 0, array, 0, storage.length);

            storage = array;
            head = 0;
            tail = size;
        }
    }

    @Override
    public void queue(Item item) {

        if(size == storage.length) increaseCapacity(2 * storage.length);
        storage[size] = item;

    }

    @Override
    public Item dequeue() {
        return null;  //To change body of implemented methods use File | Settings | File Templates.
    }

    @Override
    public boolean isEmpty() {
        return size == 0;
    }


    @Override
    public Iterator<Item> iterator() {
        return null;  //To change body of implemented methods use File | Settings | File Templates.
    }
}
