package com.complexityclass.collections.interfaces;

/**
 * Created with IntelliJ IDEA.
 * User: complexityclass
 * Date: 7/20/13
 * Time: 12:34 PM
 * To change this template use File | Settings | File Templates.
 */
public interface Stack<Item> extends Iterable<Item> {

    /**/
    void push(Item item);

    void pop();

    boolean isEmpty();

}
