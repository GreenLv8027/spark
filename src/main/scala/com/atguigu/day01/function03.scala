package com.atguigu.day01

object function03 {

  def main(args: Array[String]): Unit = {

    val arr1: Array[Int] = Array(1,2,3,4,5)
    println(foo(arr1: _*))
  }

  def foo(arr: Int*): Int ={
    arr.sum
  }

}
