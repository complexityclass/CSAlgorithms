package com.complexityclass.tests;

import com.complexityclass.collections.Bag;

import java.util.Date;

/**
 * Created with IntelliJ IDEA.
 * User: vpopov
 * Date: 17.07.13
 * Time: 16:54
 * To change this template use File | Settings | File Templates.
 */
public class BagTest {

    public static void test() {
        Bag<Integer> bag = new Bag();
        long timeStart = System.nanoTime();
        for (Integer i = 0; i < Math.pow(10, 6); i++) {
            bag.add(i);
        }
        long timeEnd = System.nanoTime();

        System.out.println("Push 1 million elements in Bag : " + (timeEnd - timeStart) / Math.pow(10, 9) + " seconds ");

        timeStart = System.nanoTime();
        int count = 0;
        for (Integer i : bag) {
            Integer current = i;
            count++;
        }
        timeEnd = System.nanoTime();

        if (count == bag.size()) {
            System.out.println("Iterable trough collection : " + (timeEnd - timeStart) / Math.pow(10, 9) + " seconds ");

        } else {
            System.out.println("error");
        }


    }

}
