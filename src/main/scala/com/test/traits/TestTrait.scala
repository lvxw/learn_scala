package com.test.traits

object TestTrait {
  class Worker{
    def say(): Unit ={
      print(123);
    }
  }
  def higer(fun:String=>Unit,str: String):Unit={
    fun(str)
  }
  higer((x:String)=>println(x),"hello world")


  def main(args: Array[String]): Unit = {
    val worker = new Worker() with StdoutLogging {
      override def say(): Unit = {
        info("hello world")
        super.say()
      }
    }
    worker.say()
  }
}
