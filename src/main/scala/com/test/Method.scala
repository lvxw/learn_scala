package com.test

case class Point(x:Double = 0.0, y:Double = 0.0){

  def shift(deltax: Double = 0.0, deltay: Double = 0.0):Point={
    copy(this.x + deltax, this.y + deltay)
  }
}

object Method {

  def main(args: Array[String]): Unit = {
    val point = Point(2,3)
    val newPoint = point.shift(1,1)
    println(newPoint)
  }
}
