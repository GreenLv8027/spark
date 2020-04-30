package com.atguigu.day07

import scala.math._

object FlatMap {

  def main(args: Array[String]): Unit = {
    val list = List(3, 5, 70,6 ,10,20)

    val list1 = list.filter(_%2==0).flatMap(x => List (x*x, x*x*x))
    val list2 = list.filter(_%2==1).flatMap(x => List (x*x*x))
    val list3 = list1 ::: list2
    println(list1)
    println(list3)

    val l1 = List("hello", "hello", "ya")
    //println(l1.groupBy(_))
  }

}
