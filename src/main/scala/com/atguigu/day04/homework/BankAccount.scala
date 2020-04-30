package com.atguigu.day04.homework

class BankAccount(initialBalance: Double) {
  private var balance = initialBalance

  def this(){
    this(0)

  }

  def deposit(amount: Double) = {
    balance += amount
    balance
  }

  def withdraw(amount: Double) = {
    balance -= amount
    balance
  }

}
