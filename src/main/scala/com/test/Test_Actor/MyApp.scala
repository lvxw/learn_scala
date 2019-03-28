package com.test.Test_Actor

import scala.actors.Actor
class HelloActor extends Actor {
  var name:String =_
  def this(name:String){
    this()
    this.name = name
  }

  def act() {
    while (true) {
      receive {
        case str:String => println(name+":\t"+str)
      }
    }
  }
}

object MyActors{
  def main(args: Array[String]): Unit = {
      new HelloActor("lisi").start().!( "zhansan")
      new HelloActor("wangwu").start() ! "wangwu"
  }
}
