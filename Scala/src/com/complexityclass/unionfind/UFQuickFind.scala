package com.complexityclass.unionfind

/**
 * Created with IntelliJ IDEA.
 * User: complexityclass
 * Date: 8/12/13
 * Time: 10:59 PM
 * To change this template use File | Settings | File Templates.
 */
class UFQuickFind(n: Int) extends UnionFind(n) {

    def find(p: Int): Int = id(p)

    def union(p: Int, q: Int) {

        val pID = find(p)
        val qID = find(q)

        if (pID == qID) {
            return
        } else {

            for (i <- 0 until id.size)
                if (id(i) == pID)
                    id(i) = qID
            count -= 1

        }

    }

}
