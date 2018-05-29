

val (label, value, coof) = (1,2,3)

label
value
coof

val pair = (1,2,3)
pair._1

{
  def squareList(xs: List[Int]): List[Int] =
    xs match {
      case Nil => xs
      case y :: ys => y * y :: squareList(ys)
    }

  squareList(List(1,2,3,4))
}

{
  def squareList(xs: List[Int]): List[Int] =
    xs map(x => x*x)

  squareList(List(1,2,3,4))
}

List(1,2,3,4) filter (x => x > 2)

val l1 = List(1,2,3,4,5)

def sum1 (xs: List[Int]) = (0::xs)reduceLeft(_ + _)


def sum2(xs:List[Int]) = (xs foldLeft 0)(_ + _)
sum2(l1)
