package com.atguigu.day08.sort

object Sort01 {


  def main(args: Array[String]): Unit = {
    val stu1 = new Student("aaa",15)
    val stu2 = new Student("bbb", 25)
    val list = List(stu1,stu2)

    implicit val ord = new Ordering[Student] {
      override def compare(x: Student, y: Student): Int = {
        if (x.age > y.age) 1
        else if (x.age < y.age) 0
        else -1
      }
    }
    println(list.sorted.reverse)
    Ordering.Tuple2
  }



}


class Student(val name: String,val age: Int) {
  override def toString: String = {
    s"name: $name ,age: $age"
  }
}