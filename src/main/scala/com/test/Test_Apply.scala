package com.test

class Test_Apply {
  def apply(){
    System.out.println("test class apply")
  }
 def apply(param: Int){
   System.out.println("test class int")
 }
  def apply(param: String){
    System.out.println("test class String")
  }
}

object Test_Apply{
  def apply(): Test_Apply = new Test_Apply()
  def apply(str:String): Test_Apply = {
    new Test_Apply()
  }
}

object App{
  def main(args: Array[String]): Unit = {
    val obj = Test_Apply("")
    obj(12)
    obj("hello")
    obj()
  }
}
