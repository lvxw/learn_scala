package com.test

object Closure {
  def m2:Int => Int={
    val factor = 2
    val multiplier = (i: Int) => i * factor
    multiplier
  }

  def main(args: Array[String]): Unit = {
    println(m2(2))
  }
}
