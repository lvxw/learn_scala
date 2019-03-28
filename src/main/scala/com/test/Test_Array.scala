package com.test

object Test_Array {

  def main(args: Array[String]): Unit = {
    val a = new Array[Int](3)
    println(a.mkString(","))

    val tail = a.tail
    println(tail.mkString(","))

    val arr = Array(1,2,3,4)

    arr.update(0,23)

    println(arr.mkString(","))
  }
}
