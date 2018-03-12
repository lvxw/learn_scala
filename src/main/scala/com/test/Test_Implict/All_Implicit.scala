package com.test.Test_Implict


object All_Implicit {

  /**
    *
    * @param str
    */
  implicit class Convert(val str: String){
    def strToInt:Int = {
      str.toInt
    }

    def add:String = {
      str+"***"
    }
  }

  import com.test.Test_Implict.All_Implicit.Convert
  def main(args: Array[String]): Unit = {
    val max = Math.max("193".strToInt,45)
    val res = "hello".add
    println(max)
    println(res)
  }

}