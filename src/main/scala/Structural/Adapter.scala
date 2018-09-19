package Structural

trait Target {
  def request: Int
}

class Adapter extends Target {
  override def request: Int = ExternalSystem.externalMethod
}

object ExternalSystem {
  def externalMethod: Int = 1
}

