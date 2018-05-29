val n = 7

val f1 = ((1 until n) map (i => (1 until i) map (j => (i,j)))).flatten
val f3  = ((1 until n) flatMap (i => (1 until i) map (j => (i,j))))
f1
f3

def isPrime(n:Int):Boolean = (2 to n/2) forall(x => n%x != 0)

for {
  i <- 1 until n
  j <- 1 until i
  if isPrime(i+j)
} yield (i,j)

def scalarProduct(xs: List[Double], ys: List[Double]) : Double = {
  (for ((x,y) <- xs zip ys) yield x*y).sum
}

val t1 = 1
val l1: List[Double] = List(1,2)
val l2: List[Double] = List(3,4)
val t2 = scalarProduct(l1, l2)


//scalarProduct(List(1.0,2,3,4), List(1,2.1,3,4))