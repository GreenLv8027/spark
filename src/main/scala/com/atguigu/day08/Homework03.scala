package com.atguigu.day08

object Homework03 {

  def main(args: Array[String]): Unit = {

    var list = List(10,20,30,None,80,11,None,2)

    list match {
      case List(r@_*) =>
        val sum = r.filter(x => x != None).map(_.asInstanceOf[Int]).sum
        println(sum)
    }

  }

}
