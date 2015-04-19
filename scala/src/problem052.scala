object problem052 {

  def main(args: Array[String]): Unit = {
    val l = for (a <- 1 to 1000000 if (multiples(a))) yield a
    println(l.min)
  }

  def multiples(a: Int) = {
    val m = for (b <- 2 to 6) yield asDigits(a*b)
    m.forall(x=>x.equals(asDigits(a*2)))
  }
  
  def asDigits(n: Int): List[Int] = {
    n.toString.map(x=>x.asDigit).toList.sorted
  }
}