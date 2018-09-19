package Creational

import org.scalatest.{FunSuite, Matchers}

class BuilderTest extends FunSuite with Matchers {

  test("Default Builder") {
    (new Builder).asString should be ("Empty build")
  }

  test("Basic Builder with no parts") {
    (new BasicBuilder).asString should be ("Built with part A: ")
  }

  test("Basic Builder with parts added") {
    (new BasicBuilder).partA("shiny A").asString should be("Built with part A: shiny A")
  }

  test("Advanced Builder with all parts added") {
    (new AdvancedBuilder).partA("A").partB("B").
      asString should be ("Built with part A: A Built with part B: fancy B")
  }
}


