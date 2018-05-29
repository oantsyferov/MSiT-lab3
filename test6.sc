val t1 = "hello world"
val l1 = List(1,2,3,4,5)
val l2 = 1 :: 2 :: 3 :: 4 :: Nil

l2.tail
l2.head
l2.init
l2.last

l1.length


l2.take(1)
l2.drop(1)
l2(2)
l1 ++ l2
l1 ::: l2
l2.reverse
l2.updated(2,5)

def init[T](xs: List[T]): List[T] = xs match {
  case List() => throw new Error("init of empty list")
  case List(x) => List()
  case y :: ys => y :: init(ys)
}

init(l2)

def removeAt[T](n: Int, xs: List[T]): List[T] = xs match {
  case List() => xs
  case List(x) => if(n > 1) xs else List()
  case y :: ys => if(n == 1) y :: ys.tail else y::removeAt(n-1, ys)
}


removeAt(1, List('a', 'b', 'c', 'd')) // List(a, c, d)

def flatten(xs: List[Any]): List[Any] = xs match {
  case List() => Nil
  case List(x) => List(x)
  case ::(p:List[_], ps) => flatten(p) ::: flatten(ps)
  case ::(p, ps:List[_]) => p :: flatten(ps)
  case p :: ps =>  p :: flatten(ps)
//  case List() => Nil
//  case ::(p:List[_], Nil) => "("+f1(p) + ")"
//  case ::(p:List[_], ps) => "("+f1(p) + ")," + f1(ps)
//  case ::(p, Nil) => p.toString()
//  case ::(p, ps) => p + "," + f1(ps)
}

flatten(List(List(1, 1), 2, List(3, List(5, 8))))