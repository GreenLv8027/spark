package com.atguigu.day04.homework

class Point(val x: Double, val y: Double) {

  def sqaur(x: Double) = math.pow(x ,2)
  def rooting(x: Double) = math.pow(x ,0.5)

  def distance(other : Point) = {
    rooting(sqaur(this.x-other.x) + sqaur(this.y-other.y))
  }


}
