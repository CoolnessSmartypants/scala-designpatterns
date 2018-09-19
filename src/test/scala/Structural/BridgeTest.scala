package Structural

import org.scalatest.{FunSuite, Matchers}

class BridgeTest extends FunSuite with Matchers {

  test("Bridge Test") {
    val a: Abstraction = new RefinedAbstraction(new ImplementationA)
    a.highLevelOperation should be (2)
  }
}
