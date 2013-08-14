package com.complexityclass.unionfind

/**
 * Created with IntelliJ IDEA.
 * User: complexityclass
 * Date: 8/14/13
 * Time: 11:06 PM
 * To change this template use File | Settings | File Templates.
 */
class UFQuickUnion(n: Int) extends UnionFind(n) {

    def find(p: Int): Int = {
        var k = p
        while (k != id(k)) {
            k = id(k)
        }
        k
    }

    def union(p: Int, q: Int) {

        val pRoot = find(p)
        val qRoot = find(q)

        if (pRoot != qRoot) {
            id(pRoot) = qRoot
            count -= 1
        }

    }

}
