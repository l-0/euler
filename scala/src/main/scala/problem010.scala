import java.math.BigInteger
import java.util.Random
import scala.collection.mutable.ListBuffer

object problem10 {
  val lb = new ListBuffer[Int]
  def main(args: Array[String]): Unit = {
    for (a <- 1 until 2000000) {
      if (BigInteger.valueOf(a).isProbablePrime(50)) {
        lb += a
        if (a%10000<50) println(a)
      }
    }
    var s = BigInteger.ZERO
    lb.foreach { x: Int => s = s.add(BigInteger.valueOf(x)) }
    println(s)
  }

  def isPrime(a: Long): Boolean = {
    if (a == 1) return false
    if (a != 2 && a%2==0) return false
    if (a > 3 && (!is4k3(a) && !is4k1(a))) return false
    if (a > 6 && (!is6kplus1(a) && !is6kminus1(a))) return false
    for (i <- 2L to a) {
      if (i != a && a % i == 0) return false
    }
    return true
  }
  
  def is4k3(a: Long): Boolean = { 
    a > 3 && ((a-3)%4)!=0
  }
  def is4k1(a: Long): Boolean = {
    a > 3 && ((a-1)%4)!=0
  }
  def is6kplus1(a: Long): Boolean = {
    a > 6 && ((a-1)%6)!=0
  }
  def is6kminus1(a: Long): Boolean = {
    a > 6 && ((a+1)%6)!=0
  }
}