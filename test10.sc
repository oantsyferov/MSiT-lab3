val l1 = List("apple","pear","orange","pinapple")

l1 sorted

import scala.math.Ordering._

l1 sortWith String.gt
l1 sortWith String.lt
l1 sortWith (_.length < _.length)
val m1 = l1 groupBy(_.head) withDefaultValue List()

m1('p')
m1('a')
m1('z')

def foo(z:Int, v:(Int)*) = v.toList.sum

foo(1,2,3,4)
