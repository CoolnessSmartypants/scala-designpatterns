package Creational

import org.scalatest.{FunSuite, Matchers}

class FactoryMethodTest extends FunSuite with Matchers {

  test("Factory Method") {
    val c: Creator = new ConcreteCreator
    val p = c.createProduct(1)
    p.toString should be ("1")
  }
}
