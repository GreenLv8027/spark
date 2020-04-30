package com.atguigu.day01

object While {

  def main(args: Array[String]): Unit = {
    var a =1
    var b =1
    while (a < 5){
      println(a)
      a +=1
    }

    do {
      println(b)
      b += 1
    }while (b < 5)

  }

}
