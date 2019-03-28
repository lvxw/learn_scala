package com.test.TestKvFunction

object Main extends App {


  val map1 = Map(
    "A" -> 1,
    "B" -> 1,
    "C" -> 1,
    "D" -> 1
  )

  var map2 = Map(
    "A1" -> 1,
    "B2" -> 1,
    "C2" -> 1
  )

  private val re: Int = map1.aggregate(0)((x, y) => x+y._2, (x, y) => x+y)
  println(re)

}
