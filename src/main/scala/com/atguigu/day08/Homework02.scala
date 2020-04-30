package com.atguigu.day08

object Homework02 {

  def main(args: Array[String]): Unit = {

    val list = List(10, 30, None, 60)
   /* val sum = list.map( x => if (x.isInstanceOf[Int]) x else 0).reduce((a,b)=>a+b)
    println(list)
    println(sum)
*/
    list match {
      case List(r@_*) => {
        r.map( x => if (x!= None) x)
      }
    }

  }

}
