import scala.collection.mutable.ListBuffer

object problem030 {

  def main(args: Array[String]): Unit = {
    val lb = new ListBuffer[Int]
    for (a <- 2 to 999999) {
      val digits = a.toString.map(x=>x.asDigit).toList
      if (a == sum(digits)) lb += a 
    }
    println(lb.sum)
  }

  def sum(digits: List[Int]) = {
    val s = for(n <- digits) yield BigInt(n).pow(5)
    s.sum
  }
}