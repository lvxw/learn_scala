package com.test.Test_Class

class Person(name:String) {


}

object Person{

  def aa():String = {throw new NoSuchFieldException()}




  def main(args: Array[String]): Unit = {
    var r = ""
    try {
      r = aa()
    } catch {
      case e => println(e)
    }
    println(r.getClass)
  }

}
