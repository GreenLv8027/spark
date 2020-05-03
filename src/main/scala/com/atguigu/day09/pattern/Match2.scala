package com.atguigu.day09.pattern

object Match2 {

  def main(args: Array[String]): Unit = {
    val list = List(10,"aaa", true, 20, 30)
    //创建偏函数
    val f = new PartialFunction[Any, Int] {
      //判断哪些元素符合要求，可以计算。也就是偏好是什么
      //作用相当于filter
      //isDefinedAt，只用在collect方法中
      override def isDefinedAt(x: Any): Boolean = x match {
        case _:Int => true
        case _ => false
      }
      //符合要求的元素，使用apply进行计算。
      //作用相当于map
      override def apply(v1: Any): Int = v1 match {
        case a: Int => a * 2
      }
    }
    //collect传入偏函数，即可对集合进行处理
    val list2 = list.collect(f)
    println(list2)

    val list3 = list.collect({
      case a: Int => a * 2
    })
    println(list3)
  }

}
