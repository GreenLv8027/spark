package com.atguigu.day08

object Homework01 {

  def main(args: Array[String]): Unit = {

    var arr = Array(10,20,30,60,80,55,11)
    //arr.foreach(println)
    arr.foreach(println)

    arr match {
      case Array(a,b, r@_*) =>
        (b +: a +: r.toList).toArray

      case _ =>
    }

  }

}
