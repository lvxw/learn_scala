package com.test.sort

object TestSorted extends App{


  def test1(): Unit ={

    val li1 = List(1,2,3,234,53,5,36,4,7,56,786,8,3,5,34,5)
    val li2=List("abc","bcd","cde")

    val newLi1 = li1.sorted
    println(newLi1)

    val newLi2 = li2.sorted(Ordering.String.reverse)
    println(newLi2)
  }

  test1()
}
