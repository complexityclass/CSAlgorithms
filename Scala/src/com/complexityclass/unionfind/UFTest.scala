package com.complexityclass.unionfind

import scala.io.Source

/**
 * Created with IntelliJ IDEA.
 * User: complexityclass
 * Date: 8/12/13
 * Time: 10:43 PM
 * To change this template use File | Settings | File Templates.
 */
object UFTest extends App {

    val input = Source.fromFile("input.txt")

    val uff = new UFQuickFind(625)


    var start = System.nanoTime()
    input.getLines().foreach((line) => {

        val arr = line.split(" ").map(_.toInt)

        val p = arr(0)
        val q = arr(1)

        if (!uff.connected(p, q)) {
            uff.union(p, q)
        }
    })
    var end = System.nanoTime()

    println("Components : " + uff.count + "  Time : " + math.pow((end - start), 9))


    val ufu = new UFQuickUnion(625)

    start = System.nanoTime()
    input.getLines().foreach((line) => {

        val arr = line.split(" ").map(_.toInt)

        val p = arr(0)
        val q = arr(1)

        if (!ufu.connected(p, q)) {
            ufu.union(p, q)
        }
    })
    end = System.nanoTime()

    println("Components : " + ufu.count + "  Time : " + math.pow((end - start), 9))




}