object problem021 {

  def main(args: Array[String]): Unit = {
    val amicables = for (a <- 1 until 10000 if isAmicable(a)) yield a
    println(amicables.sum)
  }

  def isAmicable(n: Int) = {
    val a = properDivisors(n).sum
    val b = properDivisors(a).sum
    a != b && n == b
  }

  def properDivisors(n: Int): List[Int] = {
    val res = for (b <- 1 until n if n%b==0) yield b
    return res.toList
  }
}