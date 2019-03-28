package com.test.TestApp

import com.test.TestApp.Main.delayedInit

class Parent extends App {
  /**
    * 设置改参数后，系统会自动调用
    *     if (util.Properties.propIsSet("scala.time")) {
    *       val total = currentTime - executionStart
*           Console.println("[total " + total + "ms]")
    *     }
    * 从而打印程序的执行时间
    */
  System.setProperty("scala.time","")

  println("parent")

  //main方法运行到最后会自动调用
  delayedInit(println("------------------------"))
  delayedInit(printf("------------------------\n"))
  delayedInit(println("------------------------"))
}
