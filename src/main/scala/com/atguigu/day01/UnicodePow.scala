package com.atguigu.day01

import scala.io.StdIn

object UnicodePow {

  def main(args: Array[String]): Unit = {

    val str = StdIn.readLine("请输出想要计算的字符串")
    println(unicodePow(str))

  }

  def unicodePow(str: String) = {
    var a = 1
    for (i <- str) a *= i
    a
  }

}
