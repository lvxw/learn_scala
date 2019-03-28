package com.test.TestYield

import scala.Unit

object demo1 extends App {

  private val list = Array(1,2,3,4,5)

  val re = for{
    x <- list
    if x%2==0
    if x<10
    y = x.toDouble
  } yield {
    val k = y + 1
    y*y
  }


  println(re.toList)

}
