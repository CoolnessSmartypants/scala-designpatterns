package Creational

trait Creator {
  def createProduct(code: Int): Product

}

trait Product

class ConcreteProduct1 extends Product {
  override def toString = "1"
}

class ConcreteCreator extends Creator {
  override def createProduct(code: Int): Product =
  code match {
    case 1 =>  new ConcreteProduct1()
    case _ => null
  }
}
