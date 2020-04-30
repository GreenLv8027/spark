package com.atguigu.day04

import java.text.DateFormat

object High01 {

  def main(args: Array[String]): Unit = {
    val f:Double => Double = Math.pow(_ , 2)

    //val unit = println(addDate(_))
    val f1 = (a: Int, b: (Int) => Int) =>  { println(a);
      println(b)}
    val f2 =(c: Int) => c + 15
    f1(3,f2)
    def f3(a: Int) :Int = a + 15
    f1(3,f3)

    high(abc _)
   // high(addDate)

  }
  def abc={println("abc")}
  def high(op: () => Unit) =op

  def addDate = {
    val date = System.currentTimeMillis()
    val format = DateFormat.getInstance()
    val dates = format.format(date)
    println(s"d\n来自：$dates")

  }

}
