package com.complexityclass.collections.interfaces;

/**
 * Created with IntelliJ IDEA.
 * User: vpopov
 * Date: 18.07.13
 * Time: 15:36
 * To change this template use File | Settings | File Templates.
 */
public interface Queue<Item> {

    /*push element in queue*/
    void queue(Item item);

    /*remoove element*/
    Item dequeue();

    boolean isEmpty();


}
