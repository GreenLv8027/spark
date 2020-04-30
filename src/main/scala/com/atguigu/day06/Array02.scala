package com.atguigu.day06

import scala.collection.mutable.ArrayBuffer

object Array02 {

  def main(args: Array[String]): Unit = {
    var arr = ArrayBuffer(10, 20)
    var arr1 = ArrayBuffer(40, 50)
    println(System.identityHashCode(arr))
    println(arr :+ 100)
    arr = arr :+ 100
    println(arr)
    println(System.identityHashCode(arr))

    val tuple = "a" → 99
    println(tuple)
  }

}
