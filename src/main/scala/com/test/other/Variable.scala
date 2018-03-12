package com.test.other

/**
  * 测试scala变量
  */
object Variable {

  /**
    * 定义全局变量时候，可以用“_”初始化，但局部变量不可以
    * 更具类型，会默认初始化值
    */
  var a:Int = _

  def test(){
    println(s"a:${a}")
  }

  def main(args: Array[String]): Unit = {
    test()
  }

}
