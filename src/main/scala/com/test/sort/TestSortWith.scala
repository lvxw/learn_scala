package com.test.sort

object TestSortWith extends App{


  def test1(): Unit ={

    val li = List(1,2,3,234,53,5,36,4,7,56,786,8,3,5,34,5)
    val list=List("abc","bcd","cde")

    val newLi1 = list.sortWith( (s,t) => s.compareTo(t) < 0 )
    println(newLi1)
    val newLi2 = li.sortWith( (s,t) => t<s )
    println(newLi2)
  }

  test1()
}
