package com.atguigu.day01

import scala.util.control.Breaks._

object function01 {

  def main(args: Array[String]): Unit = {
    println(sumZ(1000))
  }

  def sumZ(a: Int) = {
    var s = 0
    var flag =true
    for (i <- 2 to a){
      flag=true
      breakable(
      for (m <- 2 until i){
        if (i % m ==0){
          flag=false
          break()
        }
      })
      if (flag) {
        s += i
      }
    }
    s
  }

  def isPrime(a: Int): Boolean = {
    for (i <- 2 until a) {
      if (a % i == 0){
        return false
      }
    }
    return true
  }

  def sumPrime(start: Int, end: Int) = {
    var sum = 0
    var startFlow = start
    if (start < 2){
      startFlow = 2
    }
    for (i <- startFlow to end){
      if (isPrime(i)){
        sum += i
      }
    }
    sum
  }

}
