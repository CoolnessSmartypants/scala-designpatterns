package Creational

import org.scalatest.{FunSuite, Matchers}

class AbstractFactoryTest extends FunSuite with Matchers {

  test(" Abstract Builder") {
    val cf1 = new Concrete1Factory
    val a: A = cf1.createA
    val b: B = cf1.createB
    a.toString should be ("A1")
    b.toString should be ("B1")
  }
}
