package com.test


class Person(val name:String, val age:String){
  def say(): Unit ={
    println(this.name+"say: I am "+this.name+",I am "+ this.age)
  }
}

object Person{
  def apply(name:String, age:String): Person = new Person(name, age)

  def unapply(person: Person): Option[(String, String)] = {
    if(person == null){
      None
    }else{
      Some(person.name,person.age)
    }
  }
}

object Test_Unapplay {

  def main(args: Array[String]): Unit = {
    val p = Person("zahngsan", "11")

    p match {
      case Person("zahngsan", "11") => println(true)
    }
  }

}
