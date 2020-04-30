package com.atguigu.day04.homework

import javafx.scene.shape.Circle

object Test {

  def main(args: Array[String]): Unit = {
    val circle1 = new Circle(5,0,10)
    val circle2 = new Circle(5,0,0)

    println(circle1.relation(circle2))
  }

}
