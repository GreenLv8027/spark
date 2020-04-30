package com.atguigu.day05.trait1

object NFC1{

  def main(args: Array[String]): Unit = {
   /* val myUsb = new MyUsb
    myUsb.insert()
    myUsb.work()
    myUsb.pop()*/

    val myNFC = new MyNFC
 //   myNFC.start()
  }
}
abstract class NFC {
  val name: String

 // abstract def start()
}

class MyNFC extends NFC {
  override val name: String = "我的NFC"

//  override  def start(): Unit = println(s"$name 已经启动")
}


trait Usb {
  val name: String

  def init()={
    println(s"$name 初始化了")
  }
  def insert(): String
  def work(): Unit
  def pop()

}

class MyUsb extends Usb {
  override val name: String = "我的 usb"
  init()
  override def work(): Unit = println(s"$name 正在工作")
  override def pop(): Unit = println(s"$name 弹出了")
  override def insert(): String = s"$name 插入了"
}