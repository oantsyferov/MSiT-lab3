abstract class Nat {
  def isZero: Boolean
  def predecessor: Nat
  def successor: Nat
  def + (that: Nat): Nat
  def - (that: Nat): Nat
}

class Succ(n: Nat) extends Nat {
  def isZero = false



  override def predecessor: Nat = n
  override def successor: Nat = new Succ(this)
  override def +(that: Nat): Nat = {
    if(that.isZero) this
    else this.successor + that.predecessor
  }
  override def -(that: Nat): Nat = {
    if(that.isZero) this
    else this.predecessor - that.predecessor
  }

}

object Zero extends Nat{
  def isZero = true



  override def predecessor: Nat = throw new IndexOutOfBoundsException
  override def successor: Nat = new Succ(this)
  override def +(that: Nat): Nat = that
  override def -(that: Nat): Nat = if(that.isZero) this else throw new IndexOutOfBoundsException
}

object Digit {
  def apply(v:Int):Nat = if(v==0) Zero else new Succ(apply(v - 1))
}



val t1 = new Succ(new Succ(new Succ(Zero)))

val t3 = new Succ(new Succ(Zero))
val t5 = Digit(1)

t1 + Zero
t1 - Zero
Zero + t1
t1 + t3
val t4 = t1+t3

