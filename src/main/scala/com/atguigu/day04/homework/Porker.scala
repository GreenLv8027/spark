package com.atguigu.day04.homework

object Porker {
  val meihua = "♣"
  val hongtao = "♡"
  val fangpian = "◇"
  val heitao = "♤"

  def isRed(pai: String) = {
    if(pai == fangpian || pai == hongtao) {
      println("红色")
    } else {
      println("不是红色")
    }
  }

  def main(args: Array[String]): Unit = {
    println(Porker)
  }


  override def toString = s"Porker($meihua, $hongtao, $fangpian, $heitao)"
}
