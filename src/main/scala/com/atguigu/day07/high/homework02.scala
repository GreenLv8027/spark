package com.atguigu.day07.high

object homework02 {

  def main(args: Array[String]): Unit = {
    val str = "Helloee"

   /* val map = str.zipWithIndex
      .groupBy(_._1)
      .map((_._1,_._2.map(x=>(x._1, x._2))))*/

  //  println(map)


    val str1 = List("hello","ya")

    val str2 = str1.foldLeft("")((a, b) => a +"&"+ b)
    def myMakeString(a: List[String], seq: String) = {
      a.foldLeft("")((a,b)=> a+seq+b)
        .drop(seq.length)
    }

    val str3 = myMakeString(str1, "---")
    println(str3)

  }

}
