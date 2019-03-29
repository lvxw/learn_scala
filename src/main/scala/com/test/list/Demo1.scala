package com.test.list

object Demo1 extends App {

 private val list = List(9, 2, 3, 4, 5)

  println(list.:::(List(11,22)))

  println(list.::(33))
  println(list.::(List(44,55)))

  println(list.++(List(66,77)))

  println(list.+("ss"))

  println(list.+:(List(99,99)))
  println(list.:+(List(99,99)))

  println(list.:::(List(66,77)))

  val words = "The quick brown fox jumped over the lazy dog".split(' ').toList
  println(words.sortBy(x => (x.length, x.head)))
  println(words.sorted)
  println(words.sortWith((x,y) => x.length<y.length))


}
