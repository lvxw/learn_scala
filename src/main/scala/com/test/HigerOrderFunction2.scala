package com.test

object HigerOrderFunction2 {
  def main(args: Array[String]): Unit = {

    def higer2(str: String):(Int, Int) => Int = {
      (a:Int,b:Int)=>a+b
    }

    val re = higer2("")(1,2);
    println(re)

  }
}
