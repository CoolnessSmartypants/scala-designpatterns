package Creational

object MyClass {
  var instance: MyClass = null
  def MyClass(): MyClass = if (null == instance) new MyClass else null
}

class MyClass

