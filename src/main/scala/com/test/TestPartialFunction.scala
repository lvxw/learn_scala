package com.test

object TestPartialFunction {

  val pf1:PartialFunction[Any,String] ={
    case s:String => "YES"
  }
  val pf2:PartialFunction[Any,String] ={
    case s:Double => "YES"
  }
  val pf3:PartialFunction[Any,String] ={
    case s:Long => "YES"
  }

  val df:PartialFunction[Any,String] = pf1 orElse pf2 orElse pf3

  def d(x: Any, f: PartialFunction[Any,String]) = // ➎
    f.isDefinedAt(x).toString

  def main(args: Array[String]): Unit = {
    List("str", 3.14, 10) foreach { x => println(d(x,df))
    }
  }

}
