package com.atguigu.day03

object High1 {

  def main(args: Array[String]): Unit = {
    val arr= Array(2,5,7,10)
   // foreach(arr, printNum)

  //  foreach(arr, a => println(a+5000))

  //  foreach(arr, (a: Int) => println(a))

   // foreach(arr, println(_))

    //foreach(arr, _)

   // println(filter(arr, _ > 3))

   // println(reduce(arr, (last, current) => last + current))

   // val array = map(arr, _ + 10)

   // foreach(array, printNum)

    foreach2(arr, printNum)

    println("----------")

    foreach2(filter2(arr, _ > 44) , printNum)

    foreach2(map(arr, (a: Int) => a+10
    ), printNum)

    val f =(x: Int, y: Int) => x+y
    (x: Int, y: Int) => x+y
    val f2:(Int, Int) => Int =(x: Int, y: Int) => x+y

  }

  def foreach(arr: Array[Int], op: Int => Unit): Any = {
    for (elem <- arr) {
      op(elem)
    }
  }

  def map(arr: Array[Int], op: Int => Int) = {
    for (elem <- arr) yield op(elem)
  }


  def filter(arr: Array[Int], condition: Int => Boolean) = {
    for (elem <- arr if(condition(elem))) yield elem
  }

  def reduce(arr: Array[Int], op: (Int , Int) => Int) = {
    var lastResult = arr(0)
    for (i <- 1 until arr.length) {
      lastResult = op(lastResult, arr(i))
    }
    lastResult
  }

  def printNum(num: Int) = {
    println(num)
  }

  def foreach2(arr: Array[Int], op: (Int) => Unit) = {
    for (elem <- arr) {
      op(elem)
    }
  }

  def filter2(arr: Array[Int], condition: (Int) => Boolean) = {
    for (elem <- arr if (condition(elem))) yield elem
  }

  def map2(arr: Array[Int], op: (Int) => Int) = {
    for (elem <- arr) yield op(elem)
  }

  def reduce2(arr: Array[Int], op: (Int, Int) => Int) = {
    var lastResult = arr(0)
    for (i <- 1 until arr.length) op(lastResult, arr(i))
    lastResult
  }

  }
