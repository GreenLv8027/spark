package com.atguigu.day07

import scala.collection.mutable

object Map01 {

  def main(args: Array[String]): Unit = {
    var map1 = Map(("a",10), ("b",20), ("c",30))
    var map2 =mutable.Map("a" → 10, "b" → 20, "c" → 30)
    println(map1.getOrElse("d", 100))
    println(map2.getOrElseUpdate("d", 100))
    println(map1)
    println(map2)

    val str = map2.map(_._1)
    println(str)

  }

}
