package com.atguigu.day05.apply

object Apply01 {
  def main(args: Array[String]): Unit = {

    User(4)
    println(User)
    val user = new User()
    println(user)
  }
}

object User {
  def apply(n: Int)  = println("object user")
  override def toString: String = "a"
}

class User {
  def apply(n: Int)  = println("class user")
  override def toString: String = "b"

}