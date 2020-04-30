package com.atguigu.day01

object function02 {

  def main(args: Array[String]): Unit = {
    val c =1
    val d =2
    println(add1(a=10))
    print(c+d)
    foo

  }

  def add(b: Int) = b
  def add(a: Int=100, b: Int) = a +b
  def add1(a: Int =200, b: Double=100) = a + b
  def foo = println("foo...")


}
