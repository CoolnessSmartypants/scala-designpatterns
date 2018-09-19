package Structural

import org.scalatest.{FunSuite, Matchers}

class AdapterTest extends FunSuite with Matchers {

  test("Adapter Test") {
    val t: Target = new Adapter
    t.request should be (1)
  }
}

