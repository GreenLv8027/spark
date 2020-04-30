package com.atguigu.day03

object Calculate {

  def main(args: Array[String]): Unit = {

   // println(calc(3, 6, add))
   // println(calcPlus(product, 3, 4, 5, 1, 2))
   // println(calc(3, 2, f))

 //   println(calc(5, 7, (a: Int, b: Int) => a * b + b + a))

  //  val r: Int= calc(5, 7, (a, b) => a * b + b + a)

    println(calc(7, 7, _ * _))
  }

  def calc(a: Int, b: Int, op: (Int, Int) => Int) = op(a,b)

  val f = (a: Int, b: Int) => a+b

  val f2: (Int, Int) => Int = (a, b) => a+b

  (a: Int, b: Int) => a+b

  def add(x: Int, y: Int) = x+y

  def sqr(x: Int, y: Int) = x*y

  def calcPlus(op: (Int*) => Int, a: Int*) = op(a:_*)

  def product(x: Int*) = {
    var a = 1
    for (elem <- x) {
      a *= elem
    }
    a
  }
}
