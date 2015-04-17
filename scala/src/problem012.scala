import java.math.BigInteger
import scala.collection.mutable.ListBuffer

object problem012 {

  def main(args: Array[String]): Unit = {
    println(findNumber(500))
  }
  
  def findNumber(n: Int): Int = {
    def agg(i: Int, n: Int): Int = {
      val t = triangular(i)
      if (countDivisors(t) > n) t
      else agg(i+1, n)
    }
    agg(1, n)
  }
  
  def countDivisors(n: Int): Int = {
    getFactors(n)
        .filter(x => BigInt(x).isProbablePrime(100))
        .groupBy(x => x)
        .map(x => x._2.length+1)
        .product
  }
  
  def triangular(i: Int): Int = {
    ((i*0.5)*(i+1)).toInt
  }

  def getFactors(n: Int): List[Int] = {
    def divide(n: Int, a: Int, res: List[Int]): List[Int] = {
      if (n%a==0) divide(n/a, a, res :+ a) else res
    }
    val res = for (a <- 2 to scala.math.sqrt(n.toDouble).toInt) yield divide(n, a, List.empty)
    res.flatten.toList
  }

}