package com.atguigu.day03

import scala.collection.immutable.Range

object closure {

  def main(args: Array[String]): Unit = {
    def  a (): Int= {
      println("a...")
      10
    }

    val f4 =(a: Int) => (b: Int) => a + b
    val f5 :Int => Int => Int =(a: Int) => (b: Int) => a + b


    (a: Int)=>(b: Int) => a + b
    val f2: Int => (Int, Int) => Int = (a: Int) => (b: Int, c: Int) => a + b + c

      println(add(3)(4)(6))

    //  println(add(33)(55))

    val sum1 = (x: Int) => {
      y: Int => {
        z: Int => {
          x + y + z
        }
      }
    }

  }
  def add(c: Int) =(a: Int) => (b: Int) => {
    println(s"a: $a")
    println(s"b: $b")
    println(s"c: $c")
  }

}
