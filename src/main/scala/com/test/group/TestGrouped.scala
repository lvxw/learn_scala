package com.test.group

object TestGrouped extends App {

  def test(): Unit ={
    val li = List(1,2,3,4,5,67,7,899,9,9,9,9,9,0,65,564,3,3,4,23,34,45)

    val sliceCount = Math.ceil(li.size / 7.0).toInt
    val re = li.grouped(sliceCount).toList
    println(re)
  }

  test()
}
