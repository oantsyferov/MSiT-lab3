abstract  class A {
  def foo(x: Int): Boolean

  def +(that: A): A
}

class B extends A {
  def foo(x:Int): Boolean = {
    true
  }

  def +(that:A) = this

}

val t = new B()
val t3 = new B()
t + t3

val t2 = 3

trait T[T1,T2] {
  val a:T1
  var b:T2
  def hello = println("Hello!")
}

class C(var b:Int, val a:Int) extends T[Int,Int]{

}

val t11 = new C(1,2)
t11.a
t11.b
t11.hello

