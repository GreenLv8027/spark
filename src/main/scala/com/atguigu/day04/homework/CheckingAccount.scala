package com.atguigu.day04.homework

class CheckingAccount(initialBalance: Double) extends BankAccount {
  private var balance = initialBalance



  override def deposit(amount: Double) = {
    balance += amount
    balance -= 1
    balance

  }

  override def withdraw(amount: Double) = {
    balance -= amount
    balance -= 1
    balance
  }

}
