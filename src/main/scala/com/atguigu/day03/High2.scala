package com.atguigu.day03

object High2 {

  def main(args: Array[String]): Unit = {
    val f = foo()
   // println(f())
    println(f)

    val f1 = foo2(3)(_)
    println(f1)
    val i1 = foo3(3,3)
    println(i1)

  }


  def foo2(a: Int)(b: Int) = a + b
  def foo3(a: Int, b: Int) = a + b

  def foo()= {
    var b=10
    var a=10
    val f = () => {
      a += 1
      b
    }
     a
  }

}
