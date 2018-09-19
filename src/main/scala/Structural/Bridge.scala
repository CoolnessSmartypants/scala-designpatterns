package Structural

abstract class Abstraction(impl: Implementation) {
  def operation: Int = impl.lowLevel
  def highLevelOperation: Int
}

trait Implementation {
  def lowLevel: Int
}

class RefinedAbstraction(impl: Implementation) extends Abstraction(impl) {
  override def highLevelOperation: Int = 2*operation
}

class ImplementationA extends Implementation {
  override def lowLevel:Int = 1
}





