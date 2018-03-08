package com.test

import scala.annotation.tailrec

object Recursion {

  def factorial(i:BigInt): BigInt ={
    if(i == 1) i
    else{
      i* factorial(i -1)
    }
  }


  /**
    * 尾递归
    * @param i
    * @return
    */
  def factorial2(i:BigInt): BigInt ={
    @tailrec
    def fact(i:BigInt,accumulator:BigInt):BigInt={
      if(i == 1) accumulator
      else{
        fact(i-1,i*accumulator)
      }
    }
    fact(i,1)
  }


  def main(args: Array[String]): Unit = {
    for(i <- 1 to 10){
      println(factorial(i))
    }


    for(i <- 1 to 10){
      println(factorial2(i))
    }
  }

}
