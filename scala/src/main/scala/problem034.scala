import scala.collection.mutable.ListBuffer

object problem034 {

  def main(args: Array[String]): Unit = {
    val lb = new ListBuffer[Int]
    for (a <- 1 to 1000000) {
      val n = for (b <- a.toString.map(x=>x.asDigit)) yield fac(b)
      if (a != 1 && a!=2 && a == n.sum) {
        lb += a
      }
    }
    println(lb.sum)
  }
  
  def fac(n: Int): Int = {
    if (n == 0) 1
    else n*fac(n-1)
  }
}