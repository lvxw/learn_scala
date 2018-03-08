package com.test

object AnonymousFunction {
  def main(args: Array[String]): Unit = {
    val fun:Int=>Unit = (a:Int) => println(a);
  }
}
