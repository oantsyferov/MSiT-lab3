def sum(f: Int => Int)(a: Int, b: Int): Int = {
  def loop(a: Int, acc: Int): Int = {
    if (a > b) acc
    else loop(a + 1, f(a) + acc)
  }
  loop(a, 0)
}

sum(x=>x)(1,3)


class Rational(n:Int, d:Int) {
  require(d != 0, "non-zero pls")
  private def gcd(a:Int, b: Int): Int =
    if(b==0) a else gcd(b, a%b)
  private val g = gcd(n,d)
  def num = n/g
  def denum = d/g

  def add(v: Rational) = {
    new Rational(num * v.denum + v.num * d,
      denum * v.denum)
  }

  override def toString = num + "/" + denum
}

val t = new Rational(1,2)
val t1 = t.add(new Rational(1,2))

val t2 = new Rational(10,20)

t.num
t.denum

