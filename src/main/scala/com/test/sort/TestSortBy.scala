package com.test.sort

object TestSortBy extends App {

  def test1(): Unit ={
    case class Person(val name:String, val age:Int, val salary:Double)

    val personList = List(
        Person("zhangsan",22, 1506.7),
        Person("lisi",22, 2345.4),
        Person("wangwu",25, 1506.7),
        Person("zhaoliu",25, 1829.2),
        Person("suqi",25, 1112.3)
    )

    def sortRule(person: Person): (Int, Double) = {
      (person.age, person.salary)
    }

    val re: (Person => (Int,Double)) = (p:Person) => (p.age, p.salary)
    val newList = personList.sortBy(sortRule _)(Ordering.Tuple2(Ordering.Int,Ordering.Double.reverse))
    println(newList)

  }

  def test2(): Unit ={
    val li = List(1,4,5,64,2,7,8,4,436,546,74,2,535,6)
    val newLi: List[Int] = li.sortBy((a:Int) => a)(Ordering.Int.reverse)
    println(newLi)
  }

  test1()
  test2()
}


