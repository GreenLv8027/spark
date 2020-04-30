package com.atguigu.day01

object PrintTa {

  def main(args: Array[String]): Unit = {

    printJZT(6)

  }

  def printJZT(num: Int) = {
    val space: Char = ' '
    val star: Char = '*'
    for (i <- 1 to num ; m <- 1 to 2*num) {
      if ( m <  num + i  &&  m > num - i) print(star) else print(space)
      if ( m == 2*num) println()
    }
  }

}
