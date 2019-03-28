package com.test.TestYield

object demo2 extends App {

  lazy val a = init()

  def init(): Unit ={
    println(123)
  }


  object Color extends Enumeration{
    val red = Value("1")
    val green = Value("2")
    val blue = Value("3")
  }

  private val values: Color.ValueSet = Color.values
  println(Color.red)


}
