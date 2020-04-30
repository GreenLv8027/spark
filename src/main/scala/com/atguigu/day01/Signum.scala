package com.atguigu.day01

import scala.io.StdIn

object Signum {

  def main(args: Array[String]): Unit = {

    val num: Int = StdIn.readLine("请输入1个数字").toInt
    println(signum(num))
  }

  def signum(a: Int): Int = {
    if (a > 0) 1 else if ( a < 0) -1 else 0
  }
}
