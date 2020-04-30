package com.atguigu.day06

import java.io.{File, FileReader}

import scala.io.Source

object Implicit02 {

  def main(args: Array[String]): Unit = {
    implicit def file2RichF(file: File) = new RichFile(file)

    val file = new File("E:\\application_test\\spark\\src\\main\\scala\\com\\atguigu\\day06\\Implicit01.scala")
    println(file.readContent)

    val reader = new FileReader(file)

    println(reader.read())

  }

}

class RichFile(file: File) {
  def readContent: String= {
    Source.fromFile(file).mkString
  }
}
