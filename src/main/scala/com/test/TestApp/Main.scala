package com.test.TestApp

import scala.collection.JavaConversions._
import scala.compat.Platform

object Main extends Parent {


  def calculateRunTime(): Unit ={
    println(Platform.currentTime-executionStart)
  }

  def javaObj2ScalaObj(): Unit ={
    val map = dictionaryAsScalaMap(System.getProperties)
    println(map.getClass)


    for(key <- map.keySet){
      println(s"${key} -> ${map.getOrElse(key,"")}")
    }
  }

  def testIsSysPropExists(): Unit ={
    println(util.Properties.propIsSet("scala.time"))
  }



}


