package com.complexityclass.unionfind

/**
 * Created with IntelliJ IDEA.
 * User: complexityclass
 * Date: 8/12/13
 * Time: 10:34 PM
 * To change this template use File | Settings | File Templates.
 */
abstract class UnionFind {

    protected var id = new Array[Int](0)
    var count = 0

    def this(n: Int) {
        this()
        id = new Array[Int](n);
        count = n;
        for (i <- 0 until n)
            id(i) = i
    }

    def connected(p: Int, q: Int): Boolean = {
        return find(p) == find(q)
    }

   def union(p: Int, q: Int)

    def find(p: Int): Int
}
