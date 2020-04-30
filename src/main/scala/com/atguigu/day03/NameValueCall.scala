package com.atguigu.day03

object NameValueCall {

  def main(args: Array[String]): Unit = {
   /* val a : Int = {
      println("hhh")
      10
    }

    def c ():Int = {
      println("hhh")
      10
    }*/

/*println("------")

    foo1(b)

    println("-------")

    foo(b)

    println("------")*/

    foo1{
      println("hhh")
      10
    }

    println("-------")

    foo(()=>{
      println("hhh")
      10
    })




  }

  def foo(a: () => Int) = {
    a()
    a()
    a()
  }

  def foo1(a: => Int) = {
    a
    a
    a

  }

  def b ():Int = {
    println("hhh")
    10
  }
}
