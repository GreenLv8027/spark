package com.atguigu.day07

object GroupBy01 {

  def main(args: Array[String]): Unit = {
    val list = List("hello world", "hello world", "hello beautiful hello")
    val list1 = list.flatMap(x => x.split(" "))
      .groupBy(x => x)
      .map(kv => {
        (kv._1, kv._2.size)
      })
    println(list1)
  }
}
