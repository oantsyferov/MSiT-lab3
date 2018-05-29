class A {
  def foo() = println("foo")
}

object A {
  def apply() = new A()
}

val a1 = new A()
val a2 = new A()
a1.foo()

case class B(val p1:Int,val p2:Int) {
  def foo() = println("foo " + p1)
}


val b1 = new B(1,2)
val b2 = B(1,2)
b2.foo()




case object C {
  def foo() = println("foo C")
}

object D {
  def foo() = println("foo D")
}

C
D


def foo(v:Any) = v match {
  case B(p1,p2) => println("It is a B " + p1);2
  case A => 3
  case C => 5
  case D => 6
}

foo(B(2,3))
foo(A)
foo(C)
foo(D)