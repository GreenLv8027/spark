package com.atguigu.day06

object Array01 {
  def main(args: Array[String]): Unit = {
    val arr1 = Array(30, 50, "dd")
    val arr2 = Array(12, 23)

    val arr3 = arr1 ++ arr2

    val str = arr3.mkString(", ")
    println(str)

  }

}
