package com.complexityclass.functional

/**
 * Created with IntelliJ IDEA.
 * User: complexityclass
 * Date: 8/12/13
 * Time: 10:13 PM
 * To change this template use File | Settings | File Templates.
 */
object Factorial extends App {

    def factIter(n: Int): Int = {
        var res = 1;
        for (i <- 1 to n) {
            res *= i;
        }
        res
    }

    def factRec(n: Int): Int = {
        if (n == 0) 1 else n * factRec(n - 1)
    }

    def factTail(n: Int) = {
        def loop(n: Int, acc: Int): Int = if (n <= 0) acc else loop(n - 1, acc * n)
        loop(n, 1)
    }

    var start = System.nanoTime();
    factIter(30)
    var end = System.nanoTime();

    var time1 = Math.pow(end - start, 9)

    start = System.nanoTime();
    factRec(30)
    end = System.nanoTime();

    var time2 = Math.pow(end - start, 9)

    start = System.nanoTime();
    factTail(30)
    end = System.nanoTime();

    var time3 = Math.pow(end - start, 9)

    println("Iterational : " + time1)
    println("Recursive : " + time2)
    println("Tail Recrsive : " + time3)


}
