package com.atguigu.day04.homework

class Circle(val r: Double,val center: Point) extends Shape {
  def this(r: Double,x:Double, y: Double) = {
    this(r,new Point(x,y))
  }

  override def centerPoint: Unit = center

  def relation(other: Circle) = {
    if (r > center.distance(other.center)) "相离"
  }
}
