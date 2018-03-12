package com.test.Test_Implict

object Param_Implicit {
  implicit val temp = 66

  object Greeter{
    def greet(age1:Int)(implicit age2:Int):String={
      s"the bigger is ${Math.max(age1,age2)}"
    }
  }

  def main(args: Array[String]): Unit = {

    val res = Greeter.greet(12)(32)
    val res2 = Greeter.greet(12)
    println(res)
    println(res2)
  }
}
