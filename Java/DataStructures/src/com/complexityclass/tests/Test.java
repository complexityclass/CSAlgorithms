package com.complexityclass.tests;

import java.util.Stack;

/**
 * Created with IntelliJ IDEA.
 * User: complexityclass
 * Date: 7/18/13
 * Time: 12:00 AM
 * To change this template use File | Settings | File Templates.
 */
public class Test {

    public static void main(String[] args) {

        System.out.println("-----------------------------------------------------------------------------------------------");

        System.out.println("Custom stack benchmark : ");
        System.out.println();
        System.out.println("#####");
        System.out.println("Stack on list :");
        StackTest.testListStack();
        System.out.println("#####");
        System.out.println();
        System.out.println("Stack on Array :");
        System.out.println("#####");
        StackTest.testArrayStack();
        System.out.println("#####");


        System.out.println("-----------------------------------------------------------------------------------------------");

        System.out.println("java.util,stack benchmark :");
        Stack stack = new Stack();

        long start = System.nanoTime();
        for (Integer i = 0; i < Math.pow(10, 6); i++) {
            stack.push(i);
        }
        long end = System.nanoTime();

        System.out.println("Push 1 million elements in java,util.stack : " + ((end - start) * Math.pow(10, 9)) + " seconds");

        start = System.nanoTime();
        while (!stack.isEmpty()) {
            stack.pop();
        }
        end = System.nanoTime();

        System.out.println("Pop 1 million elements from java.util.stack : " + ((end - start) * Math.pow(10, 9)) + " seconds");


        System.out.println("-----------------------------------------------------------------------------------------------");
        System.out.println("Custom bag benchmark");
        BagTest.test();

       /* System.out.println("------------------------------------------------------------------------------------------------");
        System.out.println("Custom queue benchmark");
        QueueTest.test(); */


    }

}
