import scala.collection.mutable.ListBuffer

object problem027 {

  def main(args: Array[String]): Unit = {
    val lb = new ListBuffer[Int]
    val res = new ListBuffer[Int]
    for (a <- -999 to 999) {
      for (b <- -999 to 999) {
        val p = consecutivePrimesCount(a, b)
        if (lb.isEmpty || p > lb.max) lb += p;res+=a*b
      }
    }
    println(res.last)
  }

  def consecutivePrimesCount(a: Int, b: Int): Int = {
    def agg(a: Int, b: Int, n: Int, res: List[Int]): Int = {
      if (quadraticIsPrime(n, a, b)) agg(a,b,n+1,res:+n)
      else res.size
    }
    agg(a, b, 0, List.empty)
  }

  def quadraticIsPrime(n: Int, a: Int, b: Int) = {
    BigInt((n*n)+(a*n)+b).isProbablePrime(100)
  }

}