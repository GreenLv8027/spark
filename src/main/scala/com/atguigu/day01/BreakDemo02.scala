package com.atguigu.day01

import scala.io.StdIn
import scala.util.control.Breaks._

object BreakDemo02 {

  def main(args: Array[String]): Unit = {
    val str = StdIn.readLine("请输入银行卡密码")

    val a = str.toInt
    var flag = true

    breakable(
      for (i <- 2 until a) {
        println(i)
        if (a % i == 0) {
          println(s"a 不是质数")
          flag = false
          break()
        }
      }
    )
    if (flag) {
      println(s"a 是质数")
    }
  }
}
