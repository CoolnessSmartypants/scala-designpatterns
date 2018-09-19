package Creational

trait AbstractFactory {
  def createA: A
  def createB: B
}

trait A
trait B

class A1 extends A {override def toString = "A1" }
class B1 extends B {override def toString = "B1" }

class Concrete1Factory extends AbstractFactory {
  override def createA = new A1
  override def createB = new B1
}


