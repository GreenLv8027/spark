package com.atguigu.day06

import java.time.LocalDate

object Implicit03 {
  def main(args: Array[String]): Unit = {
    implicit def Int2RichI (i: Int) = new RichInt(i)
    val ago = "ago"
    val later = "later"
    val i1 = 3
    println(3 days ago)
    println(4.days(later))
  }
}

class RichInt(day: Int) {
  def days(when: String)= {
    if ("ago" == when) LocalDate.now().minusDays(day).toString
    else {LocalDate.now().plusDays(day).toString}
  }
}
