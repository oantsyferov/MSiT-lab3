val l = List("1","2","3")
val l2 = List(List(1,2,3),4,5,List(), List("one","two","three"))

val l3: List[AnyVal] = List(1,2,3)

val l4 = List("",1)
val l5 = List(1,2.9)
val l6 = List(true, 1)


val l7 = 1 :: (2 :: Nil)
val l8 = 1 :: 2 :: 3 :: Nil


l8.tail.tail.isEmpty
l8.tail.tail.tail.isEmpty


def f1(v:List[Any]): String = v match {
  case Nil => ""
  case ::(p:List[_], Nil) => "("+f1(p) + ")"
  case ::(p:List[_], ps) => "("+f1(p) + ")," + f1(ps)
  case ::(p, Nil) => p.toString()
  case ::(p, ps) => p + "," + f1(ps)
}

f1(l8)
f1(l4)
f1(l2)