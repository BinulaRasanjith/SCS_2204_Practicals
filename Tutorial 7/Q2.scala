object Q2 extends App{
  val x = new RationalNum(3,4)
  val y = new RationalNum(5,8)
  val z = new RationalNum(2,7)

  val r = (x.sub(y)).sub(z)

  println(r)
}

class RationalNum(n:Int, d:Int) {
  require(denominator > 0, "Denominator must be greater than 0")
  def numerator = n
  def denominator = d

  def neg = new RationalNum(-this.numerator, this.denominator)
  def add(r: RationalNum) = new RationalNum(this.numerator*r.denominator + this.denominator*r.numerator, this.denominator*r.denominator)
  def sub(r: RationalNum) = this.add(r.neg)

  override def toString(): String = numerator + "/" + denominator

}