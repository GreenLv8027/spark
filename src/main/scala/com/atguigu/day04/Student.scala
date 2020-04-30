package com.atguigu.day04


object St1 {
  def main(args: Array[String]): Unit = {
    val st1 = new Student1
    println(st1)

    println(st1.name)
    st1.name = "五五"
    println(st1.name)
  }
}


class Student1{

  val sex = "male"

  var age : Int = _
  var name: String = "四倍"

  def showyourself() = {
    println(this.name)
    println(name)
  }

}

