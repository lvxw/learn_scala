package com.test.TestImplicit

import scala.language.implicitConversions


class EnhanceInt(val value:Int){

  def sayHi(): Unit ={
    println("hi...........")
  }
}


object demo1 extends App {

  implicit class EnhanceInt2(val value:Int){
    def sayHi(): Unit ={
      println("hi...........")
    }
  }

  implicit object Obj {
    def hello(s:String) = println(s"Hello $s!")
  }

  def tt(s:String)(implicit o: Obj.type ) = {
    o.hello(s)
  }

  implicit def int2str(x:Int):String = x.toString
  implicit def int2List(x:Int):List[Int] = List(x)
//  implicit def int2EnhanceInt(x:Int):EnhanceInt = new EnhanceInt(x)

  implicit val str:String = "hello world!"

  def test1(i:String): Unit ={

  }

  def test2(i:Int)(implicit str:String): Unit ={
    println(str)
  }

  test1(10)

  10.sayHi()
  test2(10)

}
