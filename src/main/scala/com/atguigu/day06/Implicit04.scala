package com.atguigu.day06

object Implicit04 {

  def main(args: Array[String]): Unit = {
    implicit val a1: Int = 100
    implicit val s1: String = "well done"

    foo //使用了a1、s1，2个隐式值
    foo1 //使用了a1，1个隐式值
    foo1() //使用了默认值，200
    foo2() //使用了默认值，300
    //foo2 使用默认值时，不能省略圆括号

  }
  //隐式参数
  def foo(implicit a: Int, b: String) = println(a)
  //隐式参数带默认值
  def foo1(implicit a: Int = 200) = println(a)
  //默认值
  def foo2(a: Int = 300) = println(a)

}


