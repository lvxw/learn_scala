package com.test.other

/**
  * 测试 集合转为参数化列表
  */
object Method2{

  def joiner(str:String*):String = {
    str.mkString("-")
  }

  def joiner(li:List[String]):String={
    joiner(li:_*)
  }

  def main(args: Array[String]): Unit = {
    val newStr = joiner("hello","world","beautiful","greate")
    println(newStr)

    val li = List("1","2","3","4")
    println(joiner(li))
  }
}