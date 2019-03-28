package com.test

object Test_List {
  def main(args: Array[String]): Unit = {
    val li = List(1,2,3,4,5)

    val li2 = li :+ 1
    val li3 = 3 +: li
    val li4 = 11 :: 10 :: li

    println("li:",li)
    println("li2:",li2)
    println("li3:",li3)
    println("li4:",li4)


    val list = 1 :: (2::(3::Nil))
    println(list)
  }
}
