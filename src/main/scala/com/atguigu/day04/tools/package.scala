package com.atguigu.day04

import java.text.DateFormat

package object tools {

  def printDate() = {
    val date = DateFormat.getInstance()
    val dateStr = date.format(System.currentTimeMillis())
    println(dateStr)
  }

}
