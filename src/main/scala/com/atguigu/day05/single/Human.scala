package com.atguigu.day05.single

import scala.collection.mutable

object Human {

  def main(args: Array[String]): Unit = {
    println(makeHuman("在"))
    println(makeHuman("在"))

  }
  val humans: mutable.Map[String, Human] = mutable.Map[String, Human](
    "黄" -> new Human("黄"),
    "白" -> new Human("白"),
    "黑" -> new Human("黑"))


  def makeHuman(color: String) = humans.getOrElseUpdate(color, new Human(color))

}

class Human private(val color: String) {
  println(s"创造了$color 种人")
  override def toString: String = s"$color 种人"


}



object Animal {

}



