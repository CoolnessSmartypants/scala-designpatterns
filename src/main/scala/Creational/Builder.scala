package Creational

class Builder {
  def partA(s: String): Builder = this
  def partB(s: String): Builder = this
  def asString: String = "Empty build"
}

trait Whole

class BasicBuilder extends Builder {
  private var a = ""
  override def partA(s: String): Builder  = {
    this.a = s
    this
  }
  override def asString: String = s"Built with part A: ${this.a}"
}

class AdvancedBuilder extends BasicBuilder {
  private var a, b = ""
  override def partB(s: String): Builder = {
    this.b = s"fancy $s"
    this
  }
  override def asString: String = super.asString + s" Built with part B: ${this.b}"
}


