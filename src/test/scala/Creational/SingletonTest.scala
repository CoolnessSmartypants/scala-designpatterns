package Creational

import org.scalatest.{FunSuite, Matchers}

class SingletonTest extends FunSuite with Matchers {

  test ("Simple test") {
    MyClass.instance should be (MyClass.instance)
  }
}
