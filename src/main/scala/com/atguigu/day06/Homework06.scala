package com.atguigu.day06

object Homework06 {

  def main(args: Array[String]): Unit = {

    println(5!)

  }

  implicit class RichInt(i: Int) {

    def !(): Int = {
      var result = 1
      var num = i
      while (num >= 1) {
        result *= num
        num = num - 1
      }
      result
    }

  }

}
