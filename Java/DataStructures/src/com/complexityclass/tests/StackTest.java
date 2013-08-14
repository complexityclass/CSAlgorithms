package com.complexityclass.tests;

import com.complexityclass.collections.StackOnArray;
import com.complexityclass.collections.StackOnLinkedList;
import com.complexityclass.collections.interfaces.Stack;

import java.util.Iterator;

/**
 * Created with IntelliJ IDEA.
 * User: complexityclass
 * Date: 7/17/13
 * Time: 11:51 PM
 * To change this template use File | Settings | File Templates.
 */
public class StackTest {

    public static void testListStack() {

        Stack<Integer> listStack = new StackOnLinkedList<Integer>();

        long start = System.nanoTime();
        for (Integer i = 0; i < Math.pow(10, 6); i++) {
            listStack.push(i);
        }
        long end = System.nanoTime();

        System.out.println("Push 1 million elements in myStack : " + ((end - start) * Math.pow(10, 9)) + " seconds");

        start = System.nanoTime();
        while (!listStack.isEmpty()) {
            listStack.pop();
        }
        end = System.nanoTime();

        System.out.println("Pop 1 million elements from myStack : " + ((end - start) * Math.pow(10, 9)) + " seconds");

        int count = 0;
        start = System.nanoTime();
        for(Iterator<Integer> it = listStack.iterator(); it.hasNext(); ){
              count++;
            it.next();
        }
        end = System.nanoTime();

        System.out.println("Iterate  " + count + " elements from myStack : " + ((end - start) * Math.pow(10, 9)) + " seconds");

    }

    public static void testArrayStack() {

        Stack<Integer> arrayStack = new StackOnArray<Integer>();

        long start = System.nanoTime();
        for (Integer i = 0; i < Math.pow(10, 6); i++) {
            arrayStack.push(i);
        }
        long end = System.nanoTime();

        System.out.println("Push 1 million elements in myStack : " + ((end - start) * Math.pow(10, 9)) + " seconds");

        start = System.nanoTime();
        while (!arrayStack.isEmpty()) {
            arrayStack.pop();
        }
        end = System.nanoTime();

        System.out.println("Pop 1 million elements from myStack : " + ((end - start) * Math.pow(10, 9)) + " seconds");

    }

}
