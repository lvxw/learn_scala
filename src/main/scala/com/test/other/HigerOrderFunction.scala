package com.test.other

object HigerOrderFunction {
  def main(args: Array[String]): Unit = {
    def higer(fun:String=>Unit,str: String):Unit={
      fun(str)
    }

    higer((a:String)=>println(a),"hello world")

  }
}
