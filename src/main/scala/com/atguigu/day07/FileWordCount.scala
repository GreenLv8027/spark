package com.atguigu.day07

import scala.io.Source

object FileWordCount {

  def main(args: Array[String]): Unit = {
    //1.按行读取文件，保存为List
    val lines = Source.fromFile("E:\\wc.txt").getLines.toList
    //2.统计单词
    val wcList = lines.flatMap(_.split(" "))
      .groupBy(x => x)
      .map(m => (m._1, m._2.size))
    println(wcList)

    val list = lines.map(kv => kv.split(" "))
    println(list)
    val list2 = list.flatten
    println(list2)
  }

}
