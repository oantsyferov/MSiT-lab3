val v1 = Vector(1,2,3,4)

val v3 = v1 ++ v1
val v2 = Vector(5,3,2,1)
v1 ++ v2

v1 :+ 10
12 +: v1


Range(1,5)
val r2 = 1 to 5
1 to 10
1 until 10
2 to 5 by 2

v2 exists(_ > 2)
v2 exists(_ > 5)

val (u1,u2) = (v1 zip v2).unzip
u1
u2

u1.max
u1.product
u1.sum
u1.min

val r1 = (2 to 11/2)
(2 to 11/2) forall(x => x > 5)

def isPrime(n:Int):Boolean = (2 to n/2) forall(x => n%x != 0)

isPrime(6)
isPrime(7)
isPrime(256)

1 to 1024 filter (isPrime(_))

isPrime(313)