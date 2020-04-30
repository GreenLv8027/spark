package com.atguigu.day07.high

object Homework01 {

  def main(args: Array[String]): Unit = {
    val list = List(3, 5, 70,6 ,10,20)

    val result = list.reduce((a: Int, b: Int) => if (a > b) a else b)
    println(result)
Int.MinValue
    //(最大值, 最小值)
    //怎样确定零值？ 1.用List的第一个元素，list.head
    //2.用Int.MaxValue和Int.MinValue，来表示最大最小值
    val tuple = list.foldLeft((list(0), list(0)))((a: (Int, Int), c: Int) => {
      var x = 0
      var y = 0
      if (c > a._1) x = c
      else x = a._1

      if (c < a._2) y = c
      else y = a._2

      (x, y)


    })
    println(tuple)



  }

}
