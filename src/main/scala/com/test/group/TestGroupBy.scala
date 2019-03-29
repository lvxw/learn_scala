package com.test.group

object TestGroupBy extends App {

  def test(): Unit ={
    val li = List(1,2,3,4,5,67,7,899,9,9,9,9,9,0,65,564,3,3,4,23)

    val re = li.groupBy { x =>
      x match {
        case i if i <3 => "a"
        case i if i <12 => "b"
        case i if i <24 => "c"
        case _ => "d"
      }
    }
    println(re)
  }

  test()
}
