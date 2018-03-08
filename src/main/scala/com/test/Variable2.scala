package com.test

class Person(val name:String,var age:Int){

}

/**
  * 测试scala变量
  */
object Variable2 {
  def main(args: Array[String]): Unit = {
    val p = new Person("zhangsan",22)
    p.age=33
  }
}
